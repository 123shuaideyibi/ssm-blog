package com.atgongda.dao;

import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/15:32
 */
public interface MyBlogMapper {

    //查看我的所有博客列表
    List<Article> queryMyBlogList(Long userId);

    //查看我的博客
    List<Article> queryMyBlog(Long articleId);


}
