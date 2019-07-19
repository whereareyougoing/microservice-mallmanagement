package com.demo.user.service.impl;

import com.demo.user.pojo.User;
import com.demo.user.repository.UserMapper;
import com.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 宋艾衡
 * 2019/7/19 11:10
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User selectUser(String username) {
        return userMapper.selectUser(username);
    }
}
