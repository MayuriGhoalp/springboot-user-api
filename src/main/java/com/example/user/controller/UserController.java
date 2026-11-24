package com.example.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.user.entity.UserEntity;
import com.example.user.service.Userservice;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
    private Userservice userService;

    @GetMapping("/all")
    public List<UserEntity> getAllUsers() {
        return userService.getAllUsersWithJournals();
    }
    
    @PostMapping("/save")
    public UserEntity saveUser(@RequestBody UserEntity user) {
        return userService.saveUser(user);
    }
}
