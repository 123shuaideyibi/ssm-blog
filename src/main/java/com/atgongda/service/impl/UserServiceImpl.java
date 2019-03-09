package com.atgongda.service.impl;

import com.atgongda.dao.UserMapper;
import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

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
        User user = userMapper.findByUserName(userName);
        if (user != null && user.getUserPassword().equals(userPassword)) {
            return user;
        }
        return null;
    }

    @Override
    public boolean checkRegister(String userName, String userPassword) {
        User user = userMapper.findByUserName(userName);
        if (user == null) {//如果用户存在，返回nul，
            return userMapper.insertUser(userName, userPassword);
        }
        return false;
    }

//    @Override
//    public boolean insertUser(User user) {
//        return userMapper.insertUser(user);
//    }

}
