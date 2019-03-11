package com.atgongda.controller;


import com.atgongda.entity.Article;
import com.atgongda.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

/**
 * @author sushuai
 * @date 2019/03/09/21:44
 */
@RestController
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/writeBlog",method = RequestMethod.POST)
    public String writeBlog(Article article, Model model){
        System.out.println("aa");
        Long userId = article.getUserId();//博主id
        String articleTitle = article.getArticleTitle();//博客标题
        String articleDesc = article.getArticleDesc();//博客简介
        String articleSort = article.getArticleSort();//博客分类
        String articleContent = article.getArticleContent();//博客内容

        boolean flag = articleService.upLoad(userId,articleTitle,articleDesc,articleSort,articleContent);
        if (flag == true){
            return "a";
        }
        return null;
    }

}
