package com.edu.sys.controller;

import com.edu.sys.entity.Local;
import com.edu.sys.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Request;

import javax.xml.ws.Response;
import java.util.List;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 16:37
 * @Description:
 */
@Controller
@RequestMapping("/tt/")
public class TestController {

    @Autowired
    private LocalService localService;

    @RequestMapping("doTest")
    @ResponseBody
    public List<Local> doTest(
            Integer id){
        List list = localService.selectLocal(id);
        return list;
    }

}
