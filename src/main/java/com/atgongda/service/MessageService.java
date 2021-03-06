package com.atgongda.service;

import com.atgongda.entity.Comment;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/17/22:30
 */
public interface MessageService {
    //查找我的评论列表
    List<Comment> queryMyMessageList(String observer);

    //查看评论我的列表
    List<Comment> queryOtherMessageList(String blogger);
}
