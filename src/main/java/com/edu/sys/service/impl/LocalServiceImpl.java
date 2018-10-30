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
    public List<Local> selectLocal(Integer id) {
        return localDao.selectLocal(id);
    }
}
