package com.edu.sys.service;

import com.edu.sys.entity.Base;
import com.edu.sys.entity.Role;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description: 这个类是服务层接口
 */
public interface RoleService {

    int deleteRoleByName(Role role);

    int updateRoleByName(Role role);

    int insertRole(Role role);

    Role selectRoleByName(Role role);

    List<Map<String, Object>> getAllRole();

}
