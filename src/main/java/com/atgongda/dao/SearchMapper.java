package com.atgongda.dao;

import com.atgongda.entity.Article;
import com.atgongda.entity.SearchContent;
import com.atgongda.entity.User;

/**
 * @author sushuai
 * @date 2019/03/25/13:22
 */
public interface SearchMapper {
    //1、根据作者名搜索
    User selectUser(String searchContent);
    //2、根据文章名搜索
    Article selectArticle(String searchContent);
}
