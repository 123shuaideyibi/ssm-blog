package com.atgongda.dao;


import com.atgongda.entity.FrontArticle;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/18/20:47
 */
public interface FrontBlogMapper {

    //查看前端博客列表
    List<FrontArticle> queryFrontBlogList();

    //查看前端的博客
    FrontArticle queryFrontBlog(Long articleId);
}
