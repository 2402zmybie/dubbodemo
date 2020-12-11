package com.hr.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.hr.service.HelloService;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service(interfaceClass = HelloService.class)  //发布服务必须使用dubbo提供的service注解
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "hello" + name;
    }
}
