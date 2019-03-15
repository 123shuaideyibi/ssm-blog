package com.atgongda.dao;

import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/15:32
 */
public interface MyBlogMapper {
    List<Article> queryMyBlog(Long userId);
}
