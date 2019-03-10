package com.atgongda.dao;

import com.atgongda.entity.Article;
import org.apache.ibatis.annotations.Param;

/**
 * @author sushuai
 * @date 2019/03/10/12:01
 */
public interface ArticleMapper {
    //往文章表中插入数据
    boolean insertArticle(@Param("userId") Long userId, @Param("articleTitle") String articleTitle, @Param("articleDesc") String articleDesc, @Param("articleSort") String articleSort, @Param("articleContent") String articleContent);
}
