package com.atgongda.service.impl;

import com.atgongda.dao.CommentMapper;
import com.atgongda.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sushuai
 * @date 2019/03/17/21:28
 */
@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    private CommentMapper commentMapper;

    /**
     * 评论业务
     * @param articleId 文章id
     * @param blogger   博主
     * @param observer  评论者
     * @param commentContent    评论内容
     * @return
     */
    @Override
    public boolean checkComment(Long articleId, String blogger, String observer, String commentContent) {
        return commentMapper.insertComment(articleId,blogger,observer,commentContent);
    }
}
