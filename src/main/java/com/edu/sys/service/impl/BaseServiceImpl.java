package com.edu.sys.service.impl;

import com.edu.sys.dao.BaseDao;
import com.edu.sys.entity.Base;
import com.edu.sys.service.BaseService;
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
public class BaseServiceImpl implements BaseService {

    @Autowired
    private BaseDao baseDao;

    @Override
    public int deleteBaseById(Integer baseid) {
        int row = baseDao.deleteBaseById(baseid);
        return row;
    }

    @Override
    public int updateBaseById(Base base) {
        int row = baseDao.updateBaseById(base);
        return row;
    }

    @Override
    public int insertBase(Base base) {
        int row = baseDao.insertBase(base);
        return row;
    }

    @Override
    public Base selectBaseById(Integer baseid) {
        Base base = baseDao.selectBaseById(baseid);
        return base;
    }

    @Override
    public List<Map<String, Object>> getAllBase() {
        List<Map<String, Object>> list = baseDao.getAllBase();
        return list;
    }
}
