package com.edu.sys.service;

import com.edu.sys.entity.Base;
import com.edu.sys.entity.School;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description: 这个类是服务层接口
 */
public interface SchoolService {

    int deleteSchoolById(@Param("schoolid") Integer schoolid);

    int updateSchoolById(School school);

    int insertSchool(School school);

    School selectSchoolById(Integer schoolid);

    List<Map<String, Object>> getAllSchool();

}
