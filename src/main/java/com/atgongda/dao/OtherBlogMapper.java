package com.atgongda.dao;

import com.atgongda.entity.AfterArticle;
import com.atgongda.entity.OtherArticle;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/20/11:08
 */
public interface OtherBlogMapper {
    //查看其它博客列表
    List<OtherArticle> queryOtherBlogList();

    //查看其它的博客
    AfterArticle queryOtherBlog(Long articleId);
}
