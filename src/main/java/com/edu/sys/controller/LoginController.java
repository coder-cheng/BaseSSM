package com.edu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/18 09:08
 * @Description: 这是登录界面的控制类
 */
@Controller
@RequestMapping("/")
public class LoginController {

    @RequestMapping("indexUI")
    public String indexUI(){
        return "index";
    }
    @RequestMapping("registerUI")
    public String registerUI(){
        return "register";
    }
    @RequestMapping("checkUI")
    public String checkUI(){
        return "check";
    }
    @RequestMapping("messbase")
    public String mess_baseUI(){
        return "sys/mess-base";
    }

}
