package com.chen.pojo;
import java.io.Serializable;

public class UserInfo implements Serializable {
    private Integer userId;
    private String username;
    private String password;
    private String regEmail;
    private String mobile;
    private String icon;

    public UserInfo() {
    }

    public UserInfo(Integer userId, String username, String password, String regEmail, String mobile, String icon) {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.regEmail = regEmail;
        this.mobile = mobile;
        this.icon = icon;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRegEmail() {
        return regEmail;
    }

    public void setRegEmail(String regEmail) {
        this.regEmail = regEmail;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobil) {
        this.mobile = mobil;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", regEmail='" + regEmail + '\'' +
                ", mobile='" + mobile + '\'' +
                ", icon='" + icon + '\'' +
                '}';
    }
}
