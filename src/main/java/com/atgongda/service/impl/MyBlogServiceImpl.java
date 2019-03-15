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

    @Override
    public List<Article> queryMyBlog(Long userId) {
        return myBlogMapper.queryMyBlog(userId);
    }
}
