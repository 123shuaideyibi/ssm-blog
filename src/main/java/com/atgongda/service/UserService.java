package com.atgongda.service;

import com.atgongda.entity.User;

/**
 * @author sushuai
 * @date 2019/03/03/23:00
 */
public interface UserService {

    /*===============================登录start==================================================*/
    /**
     * 通过username来查询该用户的信息，如果能查到，则该用户存在，如果不能查到，则该用户不存在
     * @param userName
     * @return
     */
    User selectUserByUserName(String userName);

    /**
     * 登录成功后更改用户的状态
     * @param userName
     */
    boolean updateStatusToTrue(String userName);

    /*===============================登录end==================================================*/



    /*===============================注册start==================================================*/
    /**
     * 注册的时候插入用户的数据
     * @param user
     * @return
     */
    boolean insertUser(User user);
    /*===============================登录end==================================================*/


}
