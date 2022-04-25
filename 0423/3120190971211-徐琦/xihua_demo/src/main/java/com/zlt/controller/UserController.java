package com.zlt.controller;


import com.zlt.entity.User;
import com.zlt.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {
    @Autowired(required = false)
    UserService userService;

    @RequestMapping(value = "getAllUsers",method = {RequestMethod.GET})
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @RequestMapping(value = "login",method = {RequestMethod.POST})
    @ResponseBody
    public User login(String name,String password,String validateCode){
        return null;
    }


}
