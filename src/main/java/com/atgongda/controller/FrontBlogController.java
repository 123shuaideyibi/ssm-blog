package com.atgongda.controller;

import com.atgongda.entity.AllArticle;
import com.atgongda.entity.Article;
import com.atgongda.entity.FrontArticle;
import com.atgongda.service.FrontBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * 分类：前端
 * @author sushuai
 * @date 2019/03/18/20:45
 */
@Controller
@RequestMapping("/frontBlog")
@SessionAttributes(value = {"frontBlogList","frontBlog"})
public class FrontBlogController {
    @Autowired
    private FrontBlogService frontBlogService;

    /**
     * 查看前端分类列表
     * @return
     */
    @RequestMapping("/showFrontBlog")
    public String showFrontBlog(Model model){
        List<FrontArticle> list = frontBlogService.queryFrontBlogList();
        System.out.println(list);
        model.addAttribute("frontBlogList",list);
        return "sort/frontBlogList";
    }

    /**
     * 查看前端列表里的博客
     *
     * @param articleId
     * @return
     */
    @RequestMapping("viewFrontBlog/{articleId}")
    public String viewFrontBlog(@PathVariable("articleId") Long articleId,Model model) {
        System.out.println(articleId);
        FrontArticle list = frontBlogService.queryFrontBlog(articleId);
        model.addAttribute("frontBlog",list);
        return "sort/viewFrontBlog";
    }
}
