package com.atgongda.service.impl;

import com.atgongda.dao.ViewBlogMapper;
import com.atgongda.entity.Article;
import com.atgongda.service.ViewBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/15/22:46
 */
@Service
public class ViewBlogServiceImpl implements ViewBlogService {
    @Autowired
    private ViewBlogMapper viewBlogMapper;

    @Override
    public List<Article> queryMyBlog(Long articleId) {
        return viewBlogMapper.queryMyBlog(articleId);
    }
}
