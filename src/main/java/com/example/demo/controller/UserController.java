package com.example.demo.controller;


import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;
import com.sun.scenario.effect.Blend;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/user",method = RequestMethod.GET)
    public User findById(int id) {
        return userRepository.findById(id);
    }


    @RequestMapping(value = "/alluser",method = RequestMethod.GET)
    public getUser(Blend.Mzode mode) {
        mode.set
    }
}
