package com.atgongda.controller;

import com.atgongda.entity.AllArticle;
import com.atgongda.entity.Article;
import com.atgongda.service.AllBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * 首页
 * @author sushuai
 * @date 2019/03/16/15:12
 */
@Controller
@RequestMapping("/allBlog")
@SessionAttributes(value = {"allBlogList","allBlog"})
public class AllBlogController {

    @Autowired
    private AllBlogService allBlogService;

    /**
     * 查看首页列表
     * @return
     */
    @RequestMapping("/showAllBlog")
    public String showAllBlog(Model model){
        List<AllArticle> list = allBlogService.queryAllBlogList();
        System.out.println(list);
        model.addAttribute("allBlogList",list);
        return "sort/allBlogList";
    }

    /**
     * 查看首页列表里的博客
     * @param articleId
     * @param model
     * @return
     */
    @RequestMapping("viewAllBlog/{articleId}")
    public String viewAllBlog(@PathVariable("articleId") Long articleId, Model model){
        System.out.println(articleId);
        AllArticle list = allBlogService.queryAllBlog(articleId);
        model.addAttribute("allBlog",list);
        return "sort/viewAllBlog";
    }
}
