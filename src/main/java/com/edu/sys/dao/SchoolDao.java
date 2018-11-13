package com.edu.sys.dao;

import com.edu.sys.entity.Base;
import com.edu.sys.entity.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:37
 * @Description: 这个接口映射到mapper中，与数据库进行交互
 */
public interface SchoolDao {

    int deleteSchoolById(@Param("schoolid") Integer schoolid);

    int updateSchoolById(School school);

    int insertSchool(School school);

    School selectSchoolById(Integer schoolid);

    List<Map<String, Object>> getAllSchool();

}
