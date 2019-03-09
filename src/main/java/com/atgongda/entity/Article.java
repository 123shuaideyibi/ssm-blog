package com.atgongda.entity;

/**
 * 文章表
 * @author sushuai
 * @date 2019/03/09/21:19
 */
public class Article {
    private Long articleId;
    private User user;
    private String articleTitle;
    private String articleDesc;
    private String articleSort;
    private String articleContent;



    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    public String getArticleDesc() {
        return articleDesc;
    }

    public void setArticleDesc(String articleDesc) {
        this.articleDesc = articleDesc;
    }

    public String getArticleSort() {
        return articleSort;
    }

    public void setArticleSort(String articleSort) {
        this.articleSort = articleSort;
    }

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }
}
