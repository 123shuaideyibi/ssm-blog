package com.atgongda.dao;

import org.apache.ibatis.annotations.Param;

/**
 * @author sushuai
 * @date 2019/03/17/21:29
 */
public interface CommentMapper {
    //评论
    boolean insertComment(@Param("articleId") Long articleId, @Param("blogger") String blogger,
                          @Param("observer") String observer, @Param("commentContent") String commentContent);
}
