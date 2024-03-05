package com.example.service.impl;

import com.example.dao.TodolistDao;

import com.example.domain.Todolist;

import com.example.service.TodolistService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodolistServiceimpl implements TodolistService {
    @Autowired
    private TodolistDao todolistDao;


    @Override
    public boolean save(Todolist todolist) {
        return todolistDao.save(todolist)>0;
    }

    @Override
    public boolean update(Todolist todolist) {
        return todolistDao.update(todolist)>0;
    }

    @Override
    public boolean delete(Integer userid) {
        return todolistDao.delete(userid)>0;
    }

    @Override
    public Todolist getById(Integer userid) {
        return todolistDao.getById(userid);
    }
    @Override
    public List<Todolist> getAll() {
        return todolistDao.getAll();
    }
}


