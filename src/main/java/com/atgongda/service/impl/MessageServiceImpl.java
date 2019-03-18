package com.atgongda.service.impl;

import com.atgongda.dao.MessageMapper;
import com.atgongda.entity.Comment;
import com.atgongda.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/17/22:30
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;

    /**
     * 查找我的评论列表业务
     * @param observer
     * @return
     */
    @Override
    public List<Comment> queryMyMessageList(String observer) {
        return messageMapper.queryMyMessageList(observer);
    }

    /**
     * 查看评论我的列表业务
     * @param blogger
     * @return
     */
    @Override
    public List<Comment> queryOtherMessageList(String blogger) {
        return messageMapper.queryOtherMessageList(blogger);
    }
}
