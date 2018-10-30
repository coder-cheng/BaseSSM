package com.edu.sys.service;

import com.edu.sys.entity.Local;

import java.util.List;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 15:57
 * @Description:
 */
public interface LocalService  {

    List<Local> selectLocal(
           Integer id);

}
