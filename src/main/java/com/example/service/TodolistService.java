package com.example.service;

import com.example.dao.TodolistDao;
import com.example.domain.Todolist;

import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface TodolistService {


    public boolean save(Todolist todolist);


    public boolean update(Todolist todolist);


    public boolean delete(Integer id);


    public Todolist getById(Integer id);


    public List<Todolist> getAll();


}