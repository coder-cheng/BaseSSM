package com.edu.sys.dao;

import com.edu.sys.entity.Base;
import com.edu.sys.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:37
 * @Description: 这个接口映射到mapper中，与数据库进行交互
 */
public interface RoleDao {

    int deleteRoleByName(Role role);

    int updateRoleByName(Role role);

    int insertRole(Role role);

    Role selectRoleByName(Role role);

    List<Map<String, Object>> getAllRole();

}
