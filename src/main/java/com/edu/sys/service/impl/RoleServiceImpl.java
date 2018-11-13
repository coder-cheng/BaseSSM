package com.edu.sys.service.impl;

import com.edu.sys.dao.RoleDao;
import com.edu.sys.entity.Role;
import com.edu.sys.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-11-13 10:24
 * @Description: 这个类是业务层的实现类
 */
@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public int deleteRoleByName(Role role) {
        int row = roleDao.deleteRoleByName(role);
        return row;
    }
    @Override
    public int updateRoleByName(Role role) {
        int row = roleDao.updateRoleByName(role);
        return row;
    }
    @Override
    public int insertRole(Role role) {
        int row = roleDao.insertRole(role);
        return row;
    }
    @Override
    public Role selectRoleByName(Role role) {
        Role data = roleDao.selectRoleByName(role);
        return data;
    }
    @Override
    public List<Map<String, Object>> getAllRole() {
        List<Map<String, Object>> list = roleDao.getAllRole();
        return list;
    }
}
