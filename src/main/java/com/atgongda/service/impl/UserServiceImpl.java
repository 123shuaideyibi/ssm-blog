package com.atgongda.service.impl;

import com.atgongda.dao.UserMapper;
import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author sushuai
 * @date 2019/03/03/23:02
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    /*===============================登录start==================================================*/
    @Override
    public User selectUserByUserName(String userName) {
        return userMapper.selectUserByUserName(userName);
    }

    @Override
    public boolean updateStatusToTrue(String userName) {
        return userMapper.updateStatusToTrue(userName);
    }
    /*===============================登录end==================================================*/


    /*===============================注册start==================================================*/
    @Override
    public boolean insertUser(User user) {
        return userMapper.insertUser(user);
    }
    /*==============================注册end===================================================*/

}
