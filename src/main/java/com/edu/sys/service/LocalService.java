package com.edu.sys.service;

import com.edu.sys.entity.Local;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description: 这个类是服务层接口
 */
public interface LocalService {

    int deleteLocalById(@Param("localid") Integer localid);

    int updateLocalById(Local local);

    int insertLocal(Local local);

    Local selectLocalById(Integer localid);

    List<Map<String, Object>> getAllLocal();

}
