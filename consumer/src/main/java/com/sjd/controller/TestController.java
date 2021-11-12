package com.sjd.controller;/**
 * @projectname dubboDemo
 * @author xinao
 * @create 2021/11/11
 */

import com.sjd.service.DemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author sunjidong
 * @Date 2021/11/11
 * @Describtion
 **/
@RestController
@RequestMapping("/user")
public class TestController {
    @DubboReference(cluster = "failover",retries=2, check = false,version ="1.0.0")
    DemoService demoService;

    @RequestMapping("/test")
    public String test() {
        return demoService.sayName("haha");
    }
}
