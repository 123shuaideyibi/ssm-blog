package com.atgongda.service;

/**
 * @author sushuai
 * @date 2019/03/17/21:28
 */
public interface CommentService {
    //评论
    boolean checkComment(Long articleId, String blogger, String observer, String commentContent);
}
