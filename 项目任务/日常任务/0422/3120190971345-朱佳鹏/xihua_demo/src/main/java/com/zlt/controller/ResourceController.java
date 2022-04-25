package com.zlt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

public class ResourceController {

    @RequestMapping(value = "getMenus",method = {RequestMethod.POST})
    @ResponseBody
    public Map<String, List<String>> getMenus(String userId){
        return null;
    }

    @RequestMapping(value = "getResourceByPid",method = {RequestMethod.POST})
    @ResponseBody
    public List<String> getResourceByPid(String userId,String resourceId){
        return null;
    }

    @RequestMapping(value = "getResourceByPid",method = {RequestMethod.POST})
    @ResponseBody
    public Map<String,Map<String ,List<String>>> getResource(){
        return null;
    }

    @RequestMapping(value = "addRoleToUser",method = {RequestMethod.POST})
    @ResponseBody
    public String  addRoleToUser(int userId,int roleId){
        return null;
    }

    @RequestMapping(value = "addResourceToRole",method = {RequestMethod.POST})
    @ResponseBody
    public String  addResourceToRole(int roleId,int resourceId){
        return null;
    }
}
