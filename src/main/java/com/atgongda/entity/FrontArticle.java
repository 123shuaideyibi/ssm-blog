package com.atgongda.entity;

/**
 * 首页表
 * @author sushuai
 * @date 2019/03/16/21:21
 */
public class FrontArticle {
    private Long articleId;
    private String userName;
    private String articleTitle;
    private String articleDesc;
    private String articleSort;
    private String articleContent;


    @Override
    public String toString() {
        return "AllArticle{" +
                "articleId=" + articleId +
                ", userName='" + userName + '\'' +
                ", articleTitle='" + articleTitle + '\'' +
                ", articleDesc='" + articleDesc + '\'' +
                ", articleSort='" + articleSort + '\'' +
                ", articleContent='" + articleContent + '\'' +
                '}';
    }

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
