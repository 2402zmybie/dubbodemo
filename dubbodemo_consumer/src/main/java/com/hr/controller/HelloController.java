package com.hr.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hr.service.HelloService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class HelloController {

    //Dubbo本质上是一个网络技术, 调用另外一个服务器上的服务接口
    @Reference   //查找服务
    private HelloService helloService;

    @RequestMapping("/sayHello")
    @ResponseBody
    public String sayHello(String name) {
        return helloService.sayHello(name);
    }
}
