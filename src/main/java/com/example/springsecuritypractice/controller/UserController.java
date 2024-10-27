package com.example.springsecuritypractice.controller;

import com.example.springsecuritypractice.entity.User;
import com.example.springsecuritypractice.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    public IUserService userService;

    @GetMapping("/test")
    public String test(){
        return "hello";
    }

    @PostMapping("/create")
    public User createUser(@RequestBody User user){
        return userService.createUser(user);
    }

    @GetMapping("/{id}")
    public Optional<User> getUserByID(@PathVariable("id") int id){
        return userService.getUserByID(id);
    }

    @GetMapping
    public List<User> getAllUser(){
        return userService.getAllUser();
    }

}
