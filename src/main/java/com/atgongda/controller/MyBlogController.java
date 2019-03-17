package com.atgongda.controller;

import com.atgongda.entity.Article;
import com.atgongda.service.MyBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/15:13
 */
@Controller
@RequestMapping("/myBlog")
@SessionAttributes(value = {"myBlogList","myBlog"})
public class MyBlogController {

    @Autowired
    private MyBlogService myBlogService;

    /**
     * 查看我的博客列表
     *
     * @return
     */
    @RequestMapping("/showMyBlog/{userId}")
    public String showMyBlog(@PathVariable("userId") Long userId, Model model) {
        System.out.println(userId);
        //通过当前登录用户id打开文章列表
        List<Article> list = myBlogService.queryMyBlogList(userId);
        model.addAttribute("myBlogList", list);
        return "back/myBlogList";
    }

    /**
     * 查看我的博客
     * @return
     */
    @RequestMapping("viewMyBlog/{articleId}")
    public String viewMyBlog(@PathVariable("articleId") Long articleId,Model model){
        System.out.println(articleId);
        List<Article> list = myBlogService.queryMyBlog(articleId);
        model.addAttribute("myBlog",list);
        return "back/viewMyBlog";
    }

}
