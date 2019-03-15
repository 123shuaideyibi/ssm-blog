package com.atgongda.service;

import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/15:29
 */
public interface MyBlogService {
    //查询我的所有博客
    List<Article> queryMyBlog(Long userId);
}
