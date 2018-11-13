package com.edu.sys.service;

import com.edu.sys.entity.Base;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description: 这个类是服务层接口
 */
public interface BaseService {

    int deleteBaseById(@Param("baseid") Integer baseid);

    int updateBaseById(Base base);

    int insertBase(Base base);

    Base selectBaseById(Integer baseid);

    List<Map<String, Object>> getAllBase();

}
