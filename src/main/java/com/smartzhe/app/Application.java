package com.smartzhe.app;

import javafx.scene.Parent;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by luohuahua on 17/10/7.
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@ServletComponentScan  //将servlet,filter,listener注册成bean
public class Application {
    public static void main(String[] args) {
        //SpringApplication.run(Application.class,args);

        /*SpringApplication app = new SpringApplication(Application.class);
        app.setBannerMode(Banner.Mode.LOG);
        app.run(args);*/

        new SpringApplicationBuilder().sources(Parent.class)
                .child(Application.class).bannerMode(Banner.Mode.OFF)
                .listeners(new MyListener())
                .run(args);
    }
}
class MyListener implements ApplicationListener{

    @Override
    public void onApplicationEvent(ApplicationEvent applicationEvent) {
        System.out.println("Mylistener==============");
    }
}
