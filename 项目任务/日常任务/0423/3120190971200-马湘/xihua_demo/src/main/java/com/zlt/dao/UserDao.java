package com.zlt.dao;

import com.zlt.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserDao {
    public List<User> getAllUsers();


}
