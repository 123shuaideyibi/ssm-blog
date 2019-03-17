package com.atgongda.service;

import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/15:29
 */
public interface MyBlogService {
    //查看我的博客列表
    List<Article> queryMyBlogList(Long userId);

    //查看我的博客
    List<Article> queryMyBlog(Long articleId);
}
