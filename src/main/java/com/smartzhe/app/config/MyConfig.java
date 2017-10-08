package com.smartzhe.app.config;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * Created by luohuahua on 17/10/8.
 */
@Component
@ConfigurationProperties(prefix = "myconfig")
@Validated
public class MyConfig {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
