package com.smartzhe.app;

import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

/**
 * Created by luohuahua on 17/10/8.
 */
@SpringBootApplication
public class ExitCodeApplication {

    /**
     * 当spingboot 调用了exit时会触发ExitCodeGenerator的getExitCode方法
     * @return
     */
    @Bean
    public ExitCodeGenerator exitCodeGenerator(){
        return () -> 42;
    }

   /* public static void main(String[] args) {
        //System.exit(SpringApplication.exit(SpringApplication.run(ExitCodeApplication.class,args)));
        //SpringApplication.exit(SpringApplication.run(ExitCodeApplication.class,args));
    }*/
}
