package com.atgongda.entity;

/**
 * @author sushuai
 * @date 2019/03/24/19:31
 */
public class SearchContent {
    private String searchContent;

    @Override
    public String toString() {
        return "SearchContent{" +
                "searchContent='" + searchContent + '\'' +
                '}';
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }
}
