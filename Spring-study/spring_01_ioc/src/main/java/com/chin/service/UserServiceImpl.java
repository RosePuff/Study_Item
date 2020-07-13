package com.chin.service;

import com.chin.dao.UserDao;

/**
 * @ClassName: UserSeviceImpl
 * @Description: TODO 类描述
 * @Author: LQH
 * @Date: 2020/07/13
 * @Version: 1.0
 **/
public class UserServiceImpl implements UserService {

    // private UserDao userDao = new UserDaoImpl();

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
