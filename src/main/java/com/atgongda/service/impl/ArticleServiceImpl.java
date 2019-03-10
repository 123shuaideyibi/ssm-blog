package com.atgongda.service.impl;

import com.atgongda.dao.ArticleMapper;
import com.atgongda.dao.UserMapper;
import com.atgongda.entity.Article;
import com.atgongda.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sushuai
 * @date 2019/03/10/11:59
 */
@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleMapper articleMapper;

    /**
     * 写博客业务
     *
     * @param userId
     * @param articleTitle
     * @param articleDesc
     * @param articleSort
     * @param articleContent
     * @return
     */
    @Override
    public boolean upLoad(Long userId, String articleTitle, String articleDesc, String articleSort, String articleContent) {
        if (userId != null) {//有用户登录
            boolean flag = articleMapper.insertArticle(userId, articleTitle, articleDesc, articleSort, articleContent);
            return flag;
        }
        return false;
    }


}
