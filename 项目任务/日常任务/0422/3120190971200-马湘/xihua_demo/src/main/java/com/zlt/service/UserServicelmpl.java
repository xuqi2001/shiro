package com.zlt.service;

import com.zlt.dao.UserDao;
import com.zlt.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServicelmpl implements UserService{
    @Autowired(required = false)
    UserDao userDao;
    @Override
    public List<User> getAllUsers(){
        return  userDao.getAllUsers();
    }

}
