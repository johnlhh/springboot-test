package com.smartzhe.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;

/**
 *
 * ApplicationRunner CommandLineRunner
 * springboot启动完成之前会执行run方法
 * Created by luohuahua on 17/10/8.
 */
@Component
public class MyBean implements CommandLineRunner,Ordered {

    @Value("${name}")
    private String name;
    /**
     * springboot 读取启动时的参数
     * @param args
     */
    @Autowired
    public MyBean(ApplicationArguments args){
        boolean debug = args.containsOption("debug");


    }

    @Override
    public void run(String... strings) throws Exception {
        System.out.println("CommandLineRunner 1");
        System.out.println(name+"=======");
    }

    /**
     * 实现接口Ordered 重写getOrder方法，返回值越小越先执行
     * @return
     */
    @Override
    public int getOrder() {
        return 2;
    }
}
