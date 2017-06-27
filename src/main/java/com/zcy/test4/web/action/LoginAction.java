package com.zcy.test4.web.action;

import com.opensymphony.xwork2.ActionSupport;
import com.zcy.test4.beans.User;
import com.zcy.test4.service.UserService;

/**
 * Created by zcy on 2017/6/18.
 */
public class LoginAction extends ActionSupport {
    private UserService userService;

    public User getUser() {
        return user;
    }

    private User user;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String execute() throws Exception {
        System.out.println("fuck");
        userService.add(user);
        return SUCCESS;
    }


}
