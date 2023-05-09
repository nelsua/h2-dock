package com.mysql.h2docker.controller;

import com.mysql.h2docker.entity.UsersEnt;
import com.mysql.h2docker.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserRepo repo;
    @PostMapping("/save")
    public String saveUser(@RequestBody UsersEnt user){
        repo.save(user);
        return "user saved ...";
    }
    @GetMapping("/users")
    public List<UsersEnt> getUsers(){
        return repo.findAll();
    }
}
