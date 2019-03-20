package com.atgongda.service;

import com.atgongda.entity.AfterArticle;
import com.atgongda.entity.OtherArticle;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/20/11:07
 */
public interface OtherBlogService {
    //查看其它博客列表
    List<OtherArticle> queryOtherBlogList();

    //查看其它的博客
    AfterArticle queryOtherBlog(Long articleId);
}
