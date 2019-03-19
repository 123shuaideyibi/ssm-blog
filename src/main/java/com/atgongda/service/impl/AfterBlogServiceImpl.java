package com.atgongda.service.impl;


import com.atgongda.dao.AfterBlogMapper;
import com.atgongda.entity.AfterArticle;
import com.atgongda.service.AfterBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/19/15:12
 */
@Service
public class AfterBlogServiceImpl implements AfterBlogService {

    @Autowired
    private AfterBlogMapper afterBlogMapper;

    /**
     * 查看后端的博客列表
     *
     * @return
     */
    @Override
    public List<AfterArticle> queryAfterBlogList() {
        List<AfterArticle> list = afterBlogMapper.queryAfterBlogList();
        return list;
    }

    /**
     * 查看后端的博客
     *
     * @param articleId
     * @return
     */
    @Override
    public AfterArticle queryAfterBlog(Long articleId) {
        return afterBlogMapper.queryAfterBlog(articleId);
    }
}
