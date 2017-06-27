package com.zcy.test4.model.dao.impl;

import com.zcy.test4.beans.User;
import com.zcy.test4.model.dao.UserDao;
import org.hibernate.SessionFactory;

/**
 * Created by zcy on 2017/6/18.
 */
public class UserDaoImpl implements UserDao{

    //session工厂方法
    private SessionFactory sessionFactory;

    //注入sessionFactory
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void add(User user) {
        sessionFactory.getCurrentSession().save(user);
    }
}
