package com.atgongda.service;

import com.atgongda.entity.AllArticle;
import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/16/17:29
 */
public interface AllBlogService {
    //查看全部博客列表
    List<AllArticle> queryAllBlogList();

    //查看所有的博客
    AllArticle queryAllBlog(Long articleId);
}
