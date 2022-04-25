package com.zlt.service;

import com.zlt.entity.vo.TreeNode;
import com.zlt.entity.vo.User_resource;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

public interface ResourceService {

    public Map<User_resource, List<User_resource>> getMenus(int userId);

    public List<String> getResourceByPid(int userId,int resourceId);

    public List<TreeNode> getResource();

    public String  addRoleToUser(int userId,int roleId);

    public String  addResourceToRole(int roleId,int resourceId);
}
