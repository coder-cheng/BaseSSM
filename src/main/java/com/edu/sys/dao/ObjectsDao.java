package com.edu.sys.dao;

import com.edu.sys.entity.Objects;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:37
 * @Description: 这个接口映射到mapper中，与数据库进行交互
 */
public interface ObjectsDao {

    int deleteObjectById(@Param("objectid") Integer objectid);

    int updateObjectById(Objects objects);

    int insertObject(Objects objects);

    Objects selectObjectById(Integer objectid);

    List<Map<String, Object>> getAllObject();

}
