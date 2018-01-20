package com.yxw.userservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yangxw
 * @date: Created in 2017-12-20 11:27
 * @description:
 **/
@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/hi")
    public String hi(@RequestParam(value = "name")String name){
        return "I'm forezp"+name;
    }
}
