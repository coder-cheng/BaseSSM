package com.edu.sys.service.impl;

import com.edu.sys.dao.LocalDao;
import com.edu.sys.entity.Local;
import com.edu.sys.service.LocalService;
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
public class LocalServiceImpl implements LocalService {

    @Autowired
    private LocalDao localDao;

    @Override
    public int deleteLocalById(Integer localid) {
        int rows = localDao.deleteLocalById(localid);
        return rows;
    }

    @Override
    public int updateLocalById(Local local) {
        int rows = localDao.updateLocalById(local);
        return rows;
    }

    @Override
    public int insertLocal(Local local) {
        return localDao.insertLocal(local);
    }

    @Override
    public Local selectLocalById(Integer localid) {
        return localDao.selectLocalById(localid);
    }

    @Override
    public List<Map<String, Object>> getAllLocal() {
        return localDao.getAllLocal();
    }
}
