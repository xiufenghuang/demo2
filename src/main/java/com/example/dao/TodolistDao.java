package com.example.dao;

import com.example.domain.Todolist;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface TodolistDao {
    @Insert("insert into t_todolist ( userid, todothing, todotime, todostate) values(#{userid}, #{todothing}, #{todotime}, #{todostate})")
    public int save(Todolist todolist);

    @Update("update t_todolist set todothing = #{todothing}, todotime = #{todotime}, todostate = #{todostate} where userid = #{userid}")
    public int update(Todolist todolist);
    @Delete("delete from t_todolist where userid = #{userid}")
    public int delete(Integer userid);
    @Select("select * from t_todolist where userid = #{userid}")
    public Todolist getById(Integer userid);

    @Select("select * from t_todolist")
    public List<Todolist> getAll();
}
