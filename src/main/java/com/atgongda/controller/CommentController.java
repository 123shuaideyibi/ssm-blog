package com.atgongda.controller;

import com.atgongda.entity.Comment;
import com.atgongda.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author sushuai
 * @date 2019/03/17/15:44
 */
@Controller
@RequestMapping("/comment")
@SessionAttributes(value = {"msg1","msg2","msg3"})
public class CommentController {

    @Autowired
    private CommentService commentService;

    /**
     * 发评论
     *
     * @return
     */
    @RequestMapping(value = "/toComment", method = RequestMethod.POST)
    public String toComment(Comment comment, Model model) {
        //获取从comment收到的值
        Long articleId = comment.getArticleId();//文章id
        String blogger = comment.getBlogger();//博主
        String observer = comment.getObserver();//评论者
        String commentContent = comment.getCommentContent();//评论内容

        if (observer==""){//评论人未登录
            model.addAttribute("msg1","错误一：评论人未登录");
            return "commentFail";
        }else if (blogger.equals(observer)){//博主和评论人不能相同
            model.addAttribute("msg2","错误二：博主和评论人不能相同");
            return "commentFail";
        }else if (commentContent==""){//评论内容不能为空
            model.addAttribute("msg3","错误三：评论内容不能为空");
            return "commentFail";
        }

        //向评论表中插入数据
        boolean flag = commentService.checkComment(articleId,blogger,observer,commentContent);
        System.out.println(flag);
        return "commentSuccess";
    }
}
