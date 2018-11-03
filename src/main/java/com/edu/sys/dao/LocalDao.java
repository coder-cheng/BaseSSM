package com.edu.sys.dao;

import com.edu.sys.entity.Local;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:37
 * @Description:
 */
public interface LocalDao {

    int deleteLocalById(@Param("localid")Integer localid);

    int updateLocalById(Local local);

    int insertLocal(Local local);

    Local selectLocal(
            @Param("localid")Integer localid);
    List<Local> getAll();

}
