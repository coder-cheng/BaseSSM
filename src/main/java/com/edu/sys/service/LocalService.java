package com.edu.sys.service;

import com.edu.sys.entity.Local;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description:
 */
public interface LocalService  {

    int deleteLocalById(@Param("localid")Integer localid);

    int updateLocalById(@Param("localid")Integer localid, @Param("local")Local local);

    int insertLocal(Local local);

    Local selectLocal(Integer localid);

    List<Local> getAll();

}
