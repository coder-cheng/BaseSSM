package com.edu.sys.service.impl;

import com.edu.sys.dao.ObjectsDao;
import com.edu.sys.entity.Objects;
import com.edu.sys.service.ObjectsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 16:00
 * @Description: 这个类是服务层接口的实现类
 */
@Service
public class ObjectsServiceImpl implements ObjectsService {

    @Autowired
    private ObjectsDao objectsDao;

    @Override
    public int deleteObjectById(Integer objectid) {
        int row = objectsDao.deleteObjectById(objectid);
        return row;
    }
    @Override
    public int updateObjectById(Objects objects) {
        int row = objectsDao.updateObjectById(objects);
        return row;
    }
    @Override
    public int insertObject(Objects objects) {
        int row = objectsDao.insertObject(objects);
        return row;
    }
    @Override
    public Objects selectObjectById(Integer objectid) {
        Objects objects = objectsDao.selectObjectById(objectid);
        return objects;
    }
    @Override
    public List<Map<String, Object>> getAllObject() {
        List<Map<String, Object>> list = objectsDao.getAllObject();
        return list;
    }

}
