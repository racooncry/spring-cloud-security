package com.yxw.zipkinfeign.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author: yangxw
 * @date: Created in 2018-01-09 16:25
 * @description:
 **/
@FeignClient(value = "USER-SERVICE")
public interface SaySomething {
    @RequestMapping(value = "/user/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
