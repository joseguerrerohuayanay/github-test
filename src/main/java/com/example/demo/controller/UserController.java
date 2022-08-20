package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Scanner;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping
    List<User> findAll(){
        return userRepository.findAll();
    }

    @PostMapping
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }

    @PutMapping
    public User update(@RequestBody User user){
        return userRepository.save(user);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable Integer id){
        userRepository.deleteById(id);
    }
}
