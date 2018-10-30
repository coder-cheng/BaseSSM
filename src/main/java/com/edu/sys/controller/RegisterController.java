package com.edu.sys.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/18 09:08
 * @Description: 这是注册界面的控制类
 */
@Controller
@RequestMapping("/")
public class RegisterController {

    @RequestMapping("success")
    public String indexUI() {
        return "register-success";
    }
    @RequestMapping("cancel")
    public String loginUI(){
        return "login";
    }

}
