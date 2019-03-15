package com.atgongda.service.impl;

import com.atgongda.dao.UserListMapper;
import com.atgongda.entity.User;
import com.atgongda.service.UserListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author sushuai
 * @date 2019/03/14/22:23
 */
@Service("userListService")
public class UserListServiceImpl implements UserListService {

    @Autowired
    private UserListMapper userListMapper;

    @Override
    public List<User> queryAllUser() {
        return userListMapper.queryAllUser();
    }
}
