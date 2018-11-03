package com.edu.sys.controller;

import com.edu.sys.entity.Local;
import com.edu.sys.service.LocalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Auther: Mr.ch
 * @Date: 2018-10-29 16:37
 * @Description:
 */
@Controller
@RequestMapping("/tt/")
public class TestController {

    private final LocalService localService;

    @Autowired
    public TestController(LocalService localService) {
        this.localService = localService;
    }

    @RequestMapping("doTest")
    @ResponseBody
    public Local doTest(
            Integer id){
        Local list = localService.selectLocal(id);
        System.out.println(list);
        return list;
    }
    @RequestMapping("doTestJs")
    public String doTestJs(){
        return "pages/test1";
    }
    @RequestMapping("doHave")
    public String doHave(){
        return "pages/test2";
    }

}
