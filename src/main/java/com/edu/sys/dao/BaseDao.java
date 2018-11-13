package com.edu.sys.dao;

import com.edu.sys.entity.Base;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:37
 * @Description: 这个接口映射到mapper中，与数据库进行交互
 */
public interface BaseDao {

    int deleteBaseById(@Param("baseid") Integer baseid);

    int updateBaseById(Base base);

    int insertBase(Base base);

    Base selectBaseById(Integer baseid);

    List<Map<String, Object>> getAllBase();

}
