package com.sjd.service;/**
 * @projectname dubboDemo
 * @author xinao
 * @create 2021/11/11
 */

import org.apache.dubbo.config.annotation.DubboService;
import org.apache.dubbo.rpc.RpcContext;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

/**
 * @author sunjidong
 * @Date 2021/11/11
 * @Describtion
 **/
@DubboService(version = "1.0.0")
@Service
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayName(String name) {
        System.out.println("DemoServiceImpl.sayName");
        return name;
    }

    @Override
    public String sayHello(String name) {
        System.out.println("DemoServiceImpl.sayHello");
        return "Hello " + name + ", response from provider: " + RpcContext.getServiceContext().getLocalAddress();
    }

    @Override
    public CompletableFuture<String> sayHelloAsync(String name) {
        System.out.println("DemoServiceImpl.sayHelloAsync");
        return null;
    }
}
