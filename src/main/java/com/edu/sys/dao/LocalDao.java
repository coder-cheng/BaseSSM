package com.edu.sys.dao;

import com.edu.sys.entity.Local;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:37
 * @Description: 这个接口映射到mapper中，与数据库进行交互
 */
public interface LocalDao {

    int deleteLocalById(@Param("localid")Integer localid);

    int updateLocalById(Local local);

    int insertLocal(Local local);

    Local selectLocalById(
            @Param("localid")Integer localid);

    List<Map<String,Object>> getAllLocal();

}
