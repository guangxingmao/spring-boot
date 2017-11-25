package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//关闭自动配置,只扫描特定的类而不是全部的类
@RestController
@SpringBootApplication
public class SpringbootApplication {

	@Autowired
	private Configs configs;


	public static void main(String[] args) {
//		SpringApplication.run(SpringbootApplication.class, args);
		SpringApplicationBuilder springApplicationBuilder = new SpringApplicationBuilder(SpringbootApplication.class);
//		修改banner的模式为off
		springApplicationBuilder.bannerMode(Banner.Mode.OFF).run(args);
	}


	@RequestMapping("/config")
	public String configs() {
		StringBuilder stringBuilder = new StringBuilder("yml中的自定义配置文件");
		stringBuilder.append(configs.getName()).append("...").append(configs.getAge()).append("...").append(configs.getSex());
		return stringBuilder.toString();
	}
}
