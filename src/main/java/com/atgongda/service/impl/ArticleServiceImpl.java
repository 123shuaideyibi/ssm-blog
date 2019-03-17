package com.atgongda.service.impl;

import com.atgongda.dao.ArticleMapper;
import com.atgongda.service.ArticleService;
import org.apache.ibatis.annotations.Param;
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
     * @param articleId      文章id
     * @param userId         作者id
     * @param articleTitle   文章标题
     * @param articleDesc    文章简介
     * @param articleSort    文章分类
     * @param articleContent 文章内容
     * @return
     */
    @Override
    public boolean upLoad(Long userId, String articleTitle, String articleDesc, String articleSort, String articleContent) {

        //
        if (articleSort == "1") {
            articleSort = "前端";
        } else if (articleSort == "2") {
            articleSort = "后端";
        } else if (articleSort == "3") {
            articleSort = "数据库";
        } else {
            articleSort = "其它";
        }

        if (userId != null) {//有用户登录
            boolean flag = articleMapper.insertArticle(userId, articleTitle, articleDesc, articleSort, articleContent);
            return flag;
        }
        return false;
    }

}
