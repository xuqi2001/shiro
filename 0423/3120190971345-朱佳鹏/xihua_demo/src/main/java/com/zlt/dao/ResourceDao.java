package com.zlt.dao;

import com.zlt.entity.resource;
import com.zlt.entity.vo.User_resource;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ResourceDao {


    public List<User_resource> getMenuByUser(int userId);

    public List<User_resource> getResourceByPid(@Param("userId") int userId,@Param("Pid") int pid);

    public List<resource> getResource();

    public int addRoleToUser(@Param("userId") int userId, @Param("RoleId") int RoleId);

    public int addResourceToRole(@Param("roleId") int roleId,@Param("ResourceId") int ResourceId);

    public List<resource> getSubResource(int pid);

    public List<resource> getTopResource(int pid);
}
