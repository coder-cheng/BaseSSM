package com.edu.sys.service.impl;

import com.edu.sys.dao.UserDao;
import com.edu.sys.entity.User;
import com.edu.sys.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/19 09:33
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserDao userDao;

    @Override
    public User selectUser(long id) {
        return this.userDao.selectUser(id);
    }
}
