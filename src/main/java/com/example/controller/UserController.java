package com.example.controller;


import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/save")
    public boolean save(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping
    public boolean update(@RequestBody User user) {
        return userService.update(user);
    }

    @DeleteMapping("/{id}")
    public boolean delete(@PathVariable Integer id) {
        return userService.delete(id);
    }

    @GetMapping("/{id}")
     public User getByid(@PathVariable Integer id){
        User user=userService.getById(id);
      return user ;
    }
    @GetMapping("/")
    public List<User> getAll() {
        List<User> user1= userService.getAll();
        return user1;

    }
}
