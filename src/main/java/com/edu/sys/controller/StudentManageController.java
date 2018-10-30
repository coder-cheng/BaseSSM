package com.edu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/26 10:58
 * @Description: 这个类是学员管理控制类
 */
@Controller
@RequestMapping("stu")
public class StudentManageController {

    @RequestMapping("stuRegister")
    public String stuRegister(){
        return "register";
    }
    @RequestMapping("stuApply")
    public String stuApply(){
        return "sys/stu-mess";
    }

}
