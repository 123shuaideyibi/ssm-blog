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
@SessionAttributes(value = "myBlog")
public class MyBlogController {

    @Autowired
    private MyBlogService myBlogService;

    /**
     * 跳转到我的我的博客列表
     *
     * @return
     */
    @RequestMapping("/showMyBlog/{userId}")
    public String queryAllMyBlog(@PathVariable("userId") Long userId, Model model) {
        System.out.println("main");
        System.out.println(userId);
        List<Article> list = myBlogService.queryMyBlog(userId);
        model.addAttribute("myBlog", list);
        return "back/myBlogList";
    }
}
