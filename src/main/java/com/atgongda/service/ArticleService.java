package com.atgongda.service;

/**
 * @author sushuai
 * @date 2019/03/10/11:57
 */
public interface ArticleService {
    //写博客
    boolean upLoad(Long userId, String articleTitle, String articleDesc, String articleSort, String articleContent);

}
