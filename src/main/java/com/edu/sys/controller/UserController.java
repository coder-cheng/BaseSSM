package com.edu.sys.controller;

import com.edu.sys.entity.User;
import com.edu.sys.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: Mr.ch
 * @Date: 2018/10/19 09:33
 * @Description:
 */
@Controller
@RequestMapping("/user/")
public class UserController {

    @Resource
    private UserService userService;

    @RequestMapping("selectUser")
    public void selectUser(
            HttpServletRequest request,
            HttpServletResponse response) throws IOException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        int id = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.selectUser(id);
        ObjectMapper mapper = new ObjectMapper();
        response.getWriter().write(mapper.writeValueAsString(user));
        response.getWriter().close();
        System.out.println("执行selectUser方法");
    }

}
