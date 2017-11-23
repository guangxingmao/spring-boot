package com.example.demo;

import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

//关闭自动配置,只扫描特定的类而不是全部的类
@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SpringbootApplication.class);
		//修改banner的模式为off
		springApplicationBuilder.bannerMode(Banner.Mode.OFF).run(args);

	}
}
