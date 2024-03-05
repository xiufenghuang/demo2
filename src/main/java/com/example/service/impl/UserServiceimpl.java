package com.example.service.impl;


import com.example.dao.UserDao;
import com.example.domain.User;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceimpl implements UserService {
    @Autowired
    private UserDao userdao;

    @Override
    public boolean save(User user) {
        return userdao.save(user)>0;
    }

    @Override
    public boolean update(User user) {
        return userdao.update(user)>0;
    }

    @Override
    public boolean delete(Integer id) {
        return userdao.delete(id)>0;
    }

    @Override
    public User getById(Integer id) {
        return userdao.getById(id);
    }

    @Override
    public List<User> getAll() {
        return userdao.getAll();
    }

//    public boolean save(User user) {
//        return true;
//    }
//    public boolean update(User user) {
//        return true;
//    }
//
//    public boolean delete(Integer id) {
//        return true;
//    }
//    public User getById(Integer id) {
//        return (User) userdao.getById(id);
//    }
//
//    public List<User> getAll() {
//        return userdao.getAll();
//    }

}
