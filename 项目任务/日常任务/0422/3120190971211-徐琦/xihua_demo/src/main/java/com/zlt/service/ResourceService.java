package com.zlt.service;

import com.zlt.entity.vo.TreeNode;
import com.zlt.entity.vo.User_resource;

import java.util.List;
import java.util.Map;

public interface ResourceService {
    public Map<User_resource,List<User_resource>> getMenuByUser(int userId);
    public List<String> getResourceByPid(int userId, int resourceId);
    public List<TreeNode> getResources();
    public String addRoleToUser(int userId,int RoleId);
    public String addResourceToRole(int roleId,int ResourceId);
}
