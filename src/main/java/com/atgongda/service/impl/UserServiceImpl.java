package com.atgongda.service.impl;

import com.atgongda.dao.UserMapper;
import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import net.sf.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author sushuai
 * @date 2019/03/03/23:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /**
     * 检查用户登陆业务
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @Override
    public User checkLogin(String userName, String userPassword) {
        //登录时判断用户名是否存在
        User user = userMapper.findByUserName(userName);
        if (user != null && user.getUserPassword().equals(userPassword)) {
            return user;
        }
        return null;
    }

    /**
     * 检查用户注册业务
     *
     * @param userName
     * @param userPassword
     * @return
     */
    @Override
    public boolean checkRegister(String userName, String userPassword) {
        //注册时判断用户名是否存在
        User user = userMapper.findByUserName(userName);
        if (user == null) {//如果用户存在，返回nul，
            return userMapper.insertUser(userName, userPassword);
        }
        return false;
    }

    /**
     * 修改用户基本信息业务
     * @param userId
     * @param userName
     * @param userPassword
     * @param userPhone
     * @param userEmail
     * @return
     */
    @Override
    public boolean checkModify(Long userId, String userName, String userPassword, String userPhone, String userEmail) {
        return userMapper.updateUserInfo(userId, userName, userPassword, userPhone, userEmail);
    }



}
