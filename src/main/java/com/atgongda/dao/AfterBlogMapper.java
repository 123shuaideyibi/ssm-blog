package com.atgongda.dao;

import com.atgongda.entity.AfterArticle;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/19/15:13
 */
public interface AfterBlogMapper {
    //查看后端博客列表
    List<AfterArticle> queryAfterBlogList();

    //查看后端的博客
    AfterArticle queryAfterBlog(Long articleId);
}
