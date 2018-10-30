package com.edu.sys.dao;


import com.edu.sys.entity.User;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/19 09:33
 * @Description:
 */
public interface UserDao {

    User selectUser(long id);

}
