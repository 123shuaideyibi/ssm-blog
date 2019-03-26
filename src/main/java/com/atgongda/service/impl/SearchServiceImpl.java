package com.atgongda.service.impl;

import com.atgongda.dao.SearchMapper;
import com.atgongda.entity.Article;
import com.atgongda.entity.SearchContent;
import com.atgongda.entity.User;
import com.atgongda.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sushuai
 * @date 2019/03/25/13:22
 */
@Service
public class SearchServiceImpl implements SearchService {
    @Autowired
    private SearchMapper searchMapper;

    /**
     * 根据作者名搜索业务
     * @param searchContent
     * @return
     */
    @Override
    public User checkUser(String searchContent) {
        return searchMapper.selectUser(searchContent);
    }

    /**
     * 2、根据文章名搜索
     * @param searchContent
     * @return
     */
    @Override
    public Article checkArticle(String searchContent) {
        return searchMapper.selectArticle(searchContent);
    }


}
