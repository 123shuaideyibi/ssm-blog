package com.atgongda.controller;


import com.atgongda.entity.AfterArticle;
import com.atgongda.entity.Article;
import com.atgongda.entity.FrontArticle;
import com.atgongda.service.AfterBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * 分类：后端
 *
 * @author sushuai
 * @date 2019/03/19/15:10
 */
@Controller
@RequestMapping("/afterBlog")
@SessionAttributes(value = {"afterBlogList","afterBlog"})
public class AfterBlogController {
    @Autowired
    private AfterBlogService afterBlogService;

    /**
     * 查看后端分类列表
     * @return
     */
    @RequestMapping("/showAfterBlog")
    public String showAfterBlog(Model model){
        List<AfterArticle> list = afterBlogService.queryAfterBlogList();
        System.out.println(list);
        model.addAttribute("afterBlogList",list);
        return "sort/afterBlogList";
    }

    /**
     * 查看后端列表里的博客
     *
     * @param articleId
     * @return
     */
    @RequestMapping("viewAfterBlog/{articleId}")
    public String viewAfterBlog(@PathVariable("articleId") Long articleId, Model model) {
        System.out.println(articleId);
        AfterArticle list = afterBlogService.queryAfterBlog(articleId);
        model.addAttribute("afterBlog",list);
        return "sort/viewAfterBlog";
    }

}
