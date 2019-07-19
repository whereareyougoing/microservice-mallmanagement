package com.demo.user.repository;

import com.demo.user.pojo.User;
import org.springframework.stereotype.Repository;

/**
 * 宋艾衡
 * 2019/7/19 11:30
 */
@Repository
public interface UserMapper {


    User selectUser(String username);
}
