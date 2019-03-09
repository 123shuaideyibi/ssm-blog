package com.atgongda.dao;

import com.atgongda.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author sushuai
 * @date 2019/03/03/21:33
 */
public interface UserMapper {

    /**
     * 查找用户名和登录密码
     * @param userName
     * @return
     */
    User findByUserName(String userName);

    /**
     * 注册用户名和密码
     * @param userName
     * @param userPassword
     * @return
     */
    boolean insertUser(@Param("userName") String userName,@Param("userPassword") String userPassword);


}
