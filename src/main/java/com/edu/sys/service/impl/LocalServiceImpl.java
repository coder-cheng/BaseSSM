package com.edu.sys.service.impl;

import com.edu.sys.dao.LocalDao;
import com.edu.sys.entity.Local;
import com.edu.sys.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 16:00
 * @Description:
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
    public int updateLocalById(Integer localid, Local local) {
        int rows = localDao.updateLocalById(local);
        return rows;
    }

    @Override
    public int insertLocal(Local local) {
        return 0;
    }

    @Override
    public Local selectLocal(Integer localid) {
        return localDao.selectLocal(localid);
    }

    @Override
    public List<Local> getAll() {
        List<Local> list = localDao.getAll();
        return list;
    }
}
