package com.example.dao;

import com.example.domain.User;
import org.apache.ibatis.annotations.*;

import java.util.List;
//添加MapperTODO
//DAO层写的数据库语句类型为int或user,在Serviceimpl层加载Dao层bean对象调用Dao层方法类型为boolean,在controller层使用Service层方法设置访问路径并返回需要的类型
@Mapper
public interface UserDao {
    @Insert("insert into user (id,username,password) values(#{id},#{username},#{password})")
    public int save(User user);

    @Update("update user set username = #{username},password= #{password} where id = #{id}")
    public int update(User user);
    @Delete("delete from user where id = #{id}")
    public int delete(Integer id);
    @Select("select * from  user where id = #{id}")
    public User getById(Integer id);
    @Select("select * from user ")
    public List<User> getAll();

}
