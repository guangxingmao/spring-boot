package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by mgx on 17/11/24.
 * 使用@ConfigurationProperties注解时，开发工具提示我，要在pom文件里面加入一下依赖，不然会有警告
 * <dependency>
 * <groupId>org.springframework.boot</groupId>
 * <artifactId>spring-boot-configuration-processor</artifactId>
 * <optional>true</optional>
 * </dependency>
 */

@Component
@ConfigurationProperties(prefix = "custom") //指定配置项的前缀
public class Configs {

    private String name;

    private String sex;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
