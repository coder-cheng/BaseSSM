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

    List<Local> selectLocal(
            @Param("localid")Integer id);

}
