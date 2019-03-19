package com.atgongda.service.impl;


import com.atgongda.dao.FrontBlogMapper;
import com.atgongda.entity.AllArticle;
import com.atgongda.entity.FrontArticle;
import com.atgongda.service.FrontBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/18/20:47
 */
@Service
public class FrontBlogServiceImpl implements FrontBlogService {

    @Autowired
    private FrontBlogMapper frontBlogMapper;

    /**
     * 查看前端的博客列表
     *
     * @return
     */
    @Override
    public List<FrontArticle> queryFrontBlogList() {
        List<FrontArticle> list = frontBlogMapper.queryFrontBlogList();
        return list;
    }

    /**
     * 查看前端的博客
     *
     * @param articleId
     * @return
     */
    @Override
    public FrontArticle queryFrontBlog(Long articleId) {
        return frontBlogMapper.queryFrontBlog(articleId);
    }
}
