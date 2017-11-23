package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by mgx on 17/11/21.
 */

@RestController     //表示controller里面的方法都是以json格式输出
public class HelloSpringController {

    @RequestMapping("/hello")
    public String index() {
        return "hello1222221";
    }
}
