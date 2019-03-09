package com.atgongda.service.impl;

import com.atgongda.dao.UserMapper;
import com.atgongda.entity.User;
import com.atgongda.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.security.util.Password;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    @Override
    public boolean checkModify(Long userId, String userName, String userPassword, String userPhone, String userEmail) {
        return userMapper.updateUserInfo(userId,userName,userPassword,userPhone,userEmail);
    }


//    @Override
//    public boolean checkModify(String userName, String userPassword, String userPhone, String userEmail) {
//        //修改时检查用户名是否存在
//        User user = userMapper.findByUserName(userName);
//        System.out.println("输出用户"+user);
//        if (user != null){//用户存在
//            User up = new User();
//            up.setUserId(user.getUserId());//用户id
//            up.setUserName(userName);//用户名
//            up.setUserPassword(userPassword);//密码
//            up.setUserPhone(userPhone);//手机号
//            up.setUserEmail(userEmail);//邮件
//            return userMapper.updateUserInfo(up);
//        }
//        return false;
//    }


}
