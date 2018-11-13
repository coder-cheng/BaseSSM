package com.edu.sys.service.impl;

import com.edu.sys.dao.SchoolDao;
import com.edu.sys.entity.School;
import com.edu.sys.service.SchoolService;
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
public class SchoolServiceImpl implements SchoolService {

    @Autowired
    private SchoolDao schoolDao;

    @Override
    public int deleteSchoolById(Integer schoolid) {
        int row = schoolDao.deleteSchoolById(schoolid);
        return row;
    }
    @Override
    public int updateSchoolById(School school) {
        int row = schoolDao.updateSchoolById(school);
        return row;
    }
    @Override
    public int insertSchool(School school) {
        int row = schoolDao.insertSchool(school);
        return row;
    }
    @Override
    public School selectSchoolById(Integer schoolid) {
        School school = schoolDao.selectSchoolById(schoolid);
        return school;
    }
    @Override
    public List<Map<String, Object>> getAllSchool() {
        List<Map<String, Object>> list = schoolDao.getAllSchool();
        return list;
    }
}
