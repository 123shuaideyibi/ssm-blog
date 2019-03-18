package com.atgongda.controller;

import com.atgongda.entity.Comment;
import com.atgongda.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/17/22:09
 */
@Controller
@RequestMapping("message")
public class MessageController {

    @Autowired
    private MessageService messageService;

    /**
     * 我的评论
     *
     * @return
     */
    @RequestMapping("/myMsg/{userName}")
    public String toMyMsg(@PathVariable("userName") String observer, Model model) {
        List<Comment> list = messageService.queryMyMessageList(observer);
        model.addAttribute("myMsg", list);
        return "message/myMessage";
    }

    /**
     * 收到评论
     *
     * @return
     */
    @RequestMapping("/otherMsg/{userName}")
    public String toOtherMsg(@PathVariable("userName")String blogger,Model model) {
        List<Comment> list = messageService.queryOtherMessageList(blogger);
        model.addAttribute("otherMsg",list);
        return "message/otherMessage";
    }

}
