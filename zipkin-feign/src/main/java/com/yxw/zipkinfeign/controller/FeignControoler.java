package com.yxw.zipkinfeign.controller;

import com.yxw.zipkinfeign.service.SaySomething;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yangxw
 * @date: Created in 2018-01-09 16:24
 * @description:
 **/
@RestController
public class FeignControoler {

    @Autowired
    SaySomething saySomething;


    @RequestMapping(value = "/Hi",method = RequestMethod.GET)
    public String Hi(@RequestParam String name){
        System.out.println("进入zipkin-feign");
      return   saySomething.sayHiFromClientOne(name);
    }

}
