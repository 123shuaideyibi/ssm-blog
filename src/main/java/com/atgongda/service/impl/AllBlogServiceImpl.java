package com.atgongda.service.impl;

import com.atgongda.dao.AllBlogMapper;
import com.atgongda.entity.AllArticle;
import com.atgongda.service.AllBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/16/17:30
 */
@Service
public class AllBlogServiceImpl implements AllBlogService {

    @Autowired
    private AllBlogMapper allBlogMapper;

    /**
     * 查看全部的博客列表
     *
     * @return
     */
    @Override
    public List<AllArticle> queryAllBlogList() {
        List<AllArticle> list = allBlogMapper.queryAllBlogList();
        return list;
    }

//    /**
//     * 查看全部的博客
//     * @param articleId
//     * @return
//     */
    @Override
    public AllArticle queryAllBlog(Long articleId) {
        return allBlogMapper.queryAllBlog(articleId);
    }
}
