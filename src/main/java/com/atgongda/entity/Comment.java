package com.atgongda.entity;

/**
 * 评论表
 * @author sushuai
 * @date 2019/03/17/15:58
 */
public class Comment {
    private Long commentId;
    private Long articleId;
    private String blogger;
    private String observer;
    private String commentContent;

    @Override
    public String toString() {
        return "Comment{" +
                "commentId=" + commentId +
                ", articleId=" + articleId +
                ", blogger='" + blogger + '\'' +
                ", observer='" + observer + '\'' +
                ", commentContent='" + commentContent + '\'' +
                '}';
    }

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getBlogger() {
        return blogger;
    }

    public void setBlogger(String blogger) {
        this.blogger = blogger;
    }

    public String getObserver() {
        return observer;
    }

    public void setObserver(String observer) {
        this.observer = observer;
    }

    public String getCommentContent() {
        return commentContent;
    }

    public void setCommentContent(String commentContent) {
        this.commentContent = commentContent;
    }
}
