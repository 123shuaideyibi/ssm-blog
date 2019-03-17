package com.atgongda.dao;

import com.atgongda.entity.AllArticle;
import com.atgongda.entity.Article;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/16/17:32
 */

public interface AllBlogMapper {
    List<AllArticle> queryAllBlogList();

    //查看全部的博客
    AllArticle queryAllBlog(Long articleId);

}
