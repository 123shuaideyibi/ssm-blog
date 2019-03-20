package com.atgongda.service.impl;

import com.atgongda.dao.OtherBlogMapper;
import com.atgongda.entity.AfterArticle;
import com.atgongda.entity.OtherArticle;
import com.atgongda.service.OtherBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/20/11:07
 */
@Service
public class OtherBlogServiceImpl implements OtherBlogService {
    @Autowired
    private OtherBlogMapper otherBlogMapper;

    @Override
    public List<OtherArticle> queryOtherBlogList() {
        List<OtherArticle> list = otherBlogMapper.queryOtherBlogList();
        return list;
    }

    /**
     * 查看其它的博客
     * @param articleId
     * @return
     */
    @Override
    public AfterArticle queryOtherBlog(Long articleId) {
        return otherBlogMapper.queryOtherBlog(articleId);
    }
}
