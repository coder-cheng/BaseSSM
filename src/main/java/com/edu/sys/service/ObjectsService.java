package com.edu.sys.service;

import org.apache.ibatis.annotations.Param;
import com.edu.sys.entity.Objects;
import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description: 这个类是服务层接口
 */
public interface ObjectsService {

    int deleteObjectById(@Param("objectid") Integer objectid);

    int updateObjectById(Objects objects);

    int insertObject(Objects objects);

    Objects selectObjectById(Integer objectid);

    List<Map<String, Object>> getAllObject();

}
