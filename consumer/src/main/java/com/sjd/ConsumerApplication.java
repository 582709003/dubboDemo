package com.sjd;/**
 * @projectname dubboDemo
 * @author xinao
 * @create 2021/11/11
 */

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author sunjidong
 * @Date 2021/11/11
 * @Describtion
 **/
@SpringBootApplication
@EnableDubbo
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class,args);
    }
}
