package com.atgongda.dao;

import com.atgongda.entity.Comment;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/17/22:31
 */
public interface MessageMapper {
    //查找我的评论列表
    List<Comment> queryMyMessageList(String observer);
}
