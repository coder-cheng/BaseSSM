package com.edu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/26 10:15
 * @Description: 这个类是项目管理的控制类
 */
@Controller
@RequestMapping("/pro/")
public class ProjectManageController {

    @RequestMapping("projectMess")
    public String projectMess() {
        return "sys/proj-mess";
    }
    @RequestMapping("needSearch")
    public String needMess() {
        return "sys/need-search";
    }
    @RequestMapping("needBack")
    public String needBack() {
        return "sys/need-back";
    }
    @RequestMapping("projectNotice")
    public String projectNotice() {
        return "sys/proj-noti";
    }
    @RequestMapping("projectDesign")
    public String projectDesign() {
        return "sys/proj-back";
    }

}
