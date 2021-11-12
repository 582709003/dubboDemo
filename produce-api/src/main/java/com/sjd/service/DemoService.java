package com.sjd.service;

import java.util.concurrent.CompletableFuture;

/**
 * @author xinao
 * @projectname dubboDemo
 * @create 2021/11/11
 */
public interface DemoService {
    String sayName(String name);


    String sayHello(String name);

    default CompletableFuture<String> sayHelloAsync(String name) {
        return CompletableFuture.completedFuture(sayHello(name));
    }
}
