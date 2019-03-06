package com.atgongda.entity;

/**
 * @author sushuai
 * @date 2019/03/06/19:11
 */
public class UserInfo {
    private Long userInfoId;
    private Long userId;
    private String userInfoPhone;
    private String userInfoEmail;

    @Override
    public String toString() {
        return "UserInfo{" +
                "userInfoId=" + userInfoId +
                ", userId=" + userId +
                ", userInfoPhone='" + userInfoPhone + '\'' +
                ", userInfoEmail='" + userInfoEmail + '\'' +
                '}';
    }

    public Long getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(Long userInfoId) {
        this.userInfoId = userInfoId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserInfoPhone() {
        return userInfoPhone;
    }

    public void setUserInfoPhone(String userInfoPhone) {
        this.userInfoPhone = userInfoPhone;
    }

    public String getUserInfoEmail() {
        return userInfoEmail;
    }

    public void setUserInfoEmail(String userInfoEmail) {
        this.userInfoEmail = userInfoEmail;
    }
}
