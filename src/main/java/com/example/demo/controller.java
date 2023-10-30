package com.example.demo;

import com.example.demo.model.User;
import com.example.demo.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class controller {

    @Autowired
    private UserServiceImpl userService;

    @GetMapping("/hello")
    public String hello() {
        List<User> list = this.userService.list();
        System.out.println(list);
        return "hello";
    }
}
