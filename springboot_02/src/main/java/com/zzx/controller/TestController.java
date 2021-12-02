package com.zzx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author: zzx
 * @Date: 2021/11/29 - 11 - 29 - 14:37
 * @Description: com.zzx.controller
 * @version: 1.0
 */
@Controller
public class TestController {

    @RequestMapping("secondController")
    @ResponseBody
    public String firstController(){
        return "hello springboot3";
    }
}
