package com.atgongda.controller;

import com.atgongda.entity.AfterArticle;
import com.atgongda.entity.Article;
import com.atgongda.entity.FrontArticle;
import com.atgongda.entity.OtherArticle;
import com.atgongda.service.OtherBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

/**
 * 分类：其它
 * @author sushuai
 * @date 2019/03/20/11:04
 */
@Controller
@RequestMapping("/otherBlog")
@SessionAttributes(value = {"otherBlogList","otherBlog"})
public class OtherBlogController {

    @Autowired
    private OtherBlogService otherBlogService;
    /**
     * 查看其它分类列表
     * @return
     */
    @RequestMapping("/showOtherBlog")
    public String showOtherBlog(Model model){
        List<OtherArticle> list = otherBlogService.queryOtherBlogList();
        System.out.println(list);
        model.addAttribute("otherBlogList",list);
        return "sort/otherBlogList";
    }

    /**
     * 查看其它列表里的博客
     *
     * @param articleId
     * @return
     */
    @RequestMapping("viewOtherBlog/{articleId}")
    public String viewOtherBlog(@PathVariable("articleId") Long articleId, Model model) {
        System.out.println(articleId);
        AfterArticle list = otherBlogService.queryOtherBlog(articleId);
        model.addAttribute("otherBlog",list);
        return "sort/viewOtherBlog";
    }
}
