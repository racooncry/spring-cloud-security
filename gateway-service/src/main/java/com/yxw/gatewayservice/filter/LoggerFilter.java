package com.yxw.gatewayservice.filter;

import com.netflix.zuul.ZuulFilter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

/**
 * @author: yangxw
 * @date: Created in 2017-12-20 11:36
 * @description:
 **/
@Component
public class LoggerFilter extends ZuulFilter {
    @Autowired
    Tracer tracer;

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operator","杨小伟");
        System.out.print(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
