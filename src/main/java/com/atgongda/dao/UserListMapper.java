package com.atgongda.dao;

import com.atgongda.entity.User;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/14/22:24
 */
public interface UserListMapper {

    List<User> queryAllUser();

}
