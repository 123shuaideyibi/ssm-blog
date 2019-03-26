package com.atgongda.service;

import com.atgongda.entity.Article;
import com.atgongda.entity.SearchContent;
import com.atgongda.entity.User;

/**
 * @author sushuai
 * @date 2019/03/25/13:18
 */
public interface SearchService {
    //1、根据作者名搜索
    User checkUser(String searchContent);

    //2、根据文章名搜索
    Article checkArticle(String searchContent);
}
