package com.atgongda.dao;

import com.atgongda.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author sushuai
 * @date 2019/03/03/21:33
 */
public interface UserMapper {

    //通过用户名查找用户是否存在（登录、注册、修改都会用到）
    User findByUserName(String userName);

    //注册用户名和密码
    boolean insertUser(@Param("userName") String userName, @Param("userPassword") String userPassword);

    //更新用户信息
    boolean updateUserInfo(@Param("userId") Long userId, @Param("userName") String userName
            , @Param("userPassword") String userPassword, @Param("userPhone") String userPhone, @Param("userEmail") String userEmail);


}

