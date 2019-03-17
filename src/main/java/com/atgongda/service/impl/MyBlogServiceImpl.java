package com.atgongda.service.impl;

import com.atgongda.dao.MyBlogMapper;
import com.atgongda.entity.Article;
import com.atgongda.service.MyBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/15:30
 */
@Service
public class MyBlogServiceImpl implements MyBlogService {
    @Autowired
    private MyBlogMapper myBlogMapper;

    /**
     * 查询我的所有博客
     * @param userId
     * @return
     */
    @Override
    public List<Article> queryMyBlogList(Long userId) {
        return myBlogMapper.queryMyBlogList(userId);
    }

    /**
     * 查看我的博客
     * @param articleId
     * @return
     */
    @Override
    public List<Article> queryMyBlog(Long articleId) {
        return myBlogMapper.queryMyBlog(articleId);
    }
}
