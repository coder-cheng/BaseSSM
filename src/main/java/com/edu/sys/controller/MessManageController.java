package com.edu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/25 10:45
 * @Description: 这是信息管理界面的控制类
 */
@Controller
@RequestMapping("/sys/")
public class MessManageController {

    @RequestMapping("localMess")
    public String localMess() {
        return "sys/mess-local";
    }
    @RequestMapping("localEdit")
    public String localEdit() {
        return "sys/mess-local-edit";
    }
    @RequestMapping("baseMess")
    public String baseMess() {
        return "sys/mess-base";
    }
    @RequestMapping("baseEdit")
    public String baseEdit() {
        return "sys/mess-base-edit";
    }
    @RequestMapping("schoolMess")
    public String schoolMess() {
        return "sys/mess-school";
    }
    @RequestMapping("schoolEdit")
    public String schoolEdit() {
        return "sys/mess-school-edit";
    }
    @RequestMapping("objMess")
    public String objMess() {
        return "sys/mess-obj";
    }
    @RequestMapping("objEdit")
    public String objEdit() {
        return "sys/mess-obj-edit";
    }
    @RequestMapping("stuMess")
    public String stuMess() {
        return "sys/mess-stu";
    }
    @RequestMapping("stuEdit")
    public String stuEdit() {
        return "sys/mess-stu-edit";
    }
    @RequestMapping("roleMess")
    public String roleMess() {
        return "sys/mess-role";
    }
    @RequestMapping("roleEdit")
    public String roleEdit() {
        return "sys/mess-role-edit";
    }
}
