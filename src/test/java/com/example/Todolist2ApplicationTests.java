package com.example;


import com.example.service.TodolistService;

import com.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Todolist2ApplicationTests {
    @Autowired
    private UserService userService;
    private TodolistService todolistService;

    @Test
     public void  testgetid() {
        //User user1=userService.getById(1);
      //  System.out.println(user1);
        boolean to1=todolistService.delete(1);
        System.out.println("2313");

    }
    @Test
    void contextLoads() {
    }
}
