package com.atgongda.service;

import com.atgongda.entity.User;

/**
 * @author sushuai
 * @date 2019/03/03/23:00
 */
public interface UserService {


    //检查用户登录
    User checkLogin(String userName, String userPassword);


    //注册插入用户名和密码
    boolean checkRegister(String userName, String userPassword);



}
