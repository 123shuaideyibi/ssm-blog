package com.atgongda.dao;

import com.atgongda.entity.AllArticle;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/18/20:47
 */
public interface FrontBlogMapper {

    //查看前端博客列表
    List<AllArticle> queryFrontBlogList();
}
