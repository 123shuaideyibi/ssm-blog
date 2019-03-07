package com.atgongda.dao;

import com.atgongda.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author sushuai
 * @date 2019/03/03/21:33
 */
public interface UserMapper {

    /*===============================登录start==================================================*/
    /**
     * 通过用户名查询用户信息
     * @param userName
     * @return
     */
    User selectUserByUserName(@Param("userName") String userName);

    /**
     *更改用户的状态为true
     * @param userName
     */
    boolean updateStatusToTrue(String userName);
    /*===============================登录end==================================================*/


    /*===============================注册start==================================================*/
    /**
     * 注册的时候插入用户数据
     * @param user
     * @return
     */
    boolean insertUser(User user);
    /*===============================注册end==================================================*/


}
