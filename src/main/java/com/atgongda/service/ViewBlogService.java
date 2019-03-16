package com.atgongda.service;

import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/22:45
 */
public interface ViewBlogService {
    //查看我的博客
    List<Article> queryMyBlog(Long articleId);
}
