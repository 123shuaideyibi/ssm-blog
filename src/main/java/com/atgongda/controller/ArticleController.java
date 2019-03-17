package com.atgongda.controller;


import com.atgongda.entity.Article;
import com.atgongda.entity.User;
import com.atgongda.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * 写博客
 *
 * @author sushuai
 * @date 2019/03/09/21:44
 */
@Controller
@RequestMapping("/article")
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    /**
     * 写博客控制
     *
     * @param article
     * @param model
     * @return
     */
    @RequestMapping(value = "/writeBlog", method = RequestMethod.POST)
    public String writeBlog(Article article, User user, Model model) {
        Long userId = user.getUserId();//作者id
        String articleTitle = article.getArticleTitle();//文章标题
        String articleDesc = article.getArticleDesc();//文章简介
        String articleSort = article.getArticleSort();//文章分类
        String articleContent = article.getArticleContent();//文章内容
        System.out.println(articleSort);
        boolean flag = articleService.upLoad(userId, articleTitle, articleDesc, articleSort, articleContent);

        if (flag == true) {
            return "writeSuccess";
        }
        return null;
    }

}
