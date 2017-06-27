package com.zcy.test4.service.impl;

import com.zcy.test4.beans.User;
import com.zcy.test4.model.dao.UserDao;
import com.zcy.test4.service.UserService;

/**
 * Created by zcy on 2017/6/18.
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user) {
        userDao.add(user);
    }
}
