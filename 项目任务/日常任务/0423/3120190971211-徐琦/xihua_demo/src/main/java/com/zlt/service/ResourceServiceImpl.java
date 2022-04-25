package com.zlt.service;

import com.zlt.dao.ResourceDao;
import com.zlt.entity.Resource;
import com.zlt.entity.vo.TreeNode;
import com.zlt.entity.vo.User_resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ResourceServiceImpl implements ResourceService{
    @Autowired(required = false)
    ResourceDao resourceDao;

    public Map<User_resource, List<User_resource>> getMenus(int userId){
        Map<User_resource,List<User_resource>> map=new HashMap<User_resource,List<User_resource>>();
        List<User_resource> list=resourceDao.getMenuByUser(userId);
        for(User_resource ur:list){
            if(ur.getParent_id()==0){
                map.put(ur,null);
            }
        }
        for(User_resource ur:map.keySet()){
            List<User_resource> subMenu=new ArrayList<User_resource>();
            for(User_resource subUR:list){
                if(ur.getResource_id()==subUR.getParent_id()){
                    subMenu.add(subUR);
                }
            }
            map.put(ur,subMenu);
        }
        return map;
    }

    @Override
    public List<String> getResourceByPid(int userId, int resourceId){
        List<String> resourceNames=new ArrayList<String>();
        List<User_resource> list=resourceDao.getResourceByPid(userId,resourceId);
        for(User_resource ur:list){
            resourceNames.add(ur.getResource_name());
        }
        return resourceNames;
    }

    @Override
    public List<TreeNode> getResources(){
        List<Resource> list= resourceDao.getResources();
        List<TreeNode> topResource=new ArrayList<TreeNode>();
        for(Resource r:list){
            if(r.getResource_id()==0){
                TreeNode tn=new TreeNode();
                tn.setId(r.getResource_id());
                tn.setName(r.getResource_name());
                tn.setPid(0);
                topResource.add(tn);
            }
        }
        for(TreeNode tn:topResource){
            List<TreeNode> subTreeNode=getSubResource(list,tn.getPid());
            tn.setChildNode(subTreeNode);
        }
        return topResource;
    }

    public List<TreeNode>getSubResource(List<Resource> list,int parentId){
        List<TreeNode> sublist=new ArrayList<>();
        for(Resource r:list){
            int rid=r.getResource_id();
            int pid=r.getParent_id();
            if(pid==parentId){
                TreeNode tn=new TreeNode();
                tn.setId(r.getResource_id());
                tn.setName(r.getResource_name());
                tn.setPid(0);
                List<TreeNode> subsubNode=getSubResource(list, pid);
                tn.setChildNode(subsubNode);
                sublist.add(tn);
            }
        }
        return sublist;
    }

    public List<Resource>getSubresource(int pid){
        return resourceDao.getSubResource(pid);
    }

    public List<Resource>getTopresource(int pid){
        return resourceDao.getTopResource(pid);
    }

    @Override
    public String addRoleToUser(int userId,int roleId){
        int result=resourceDao.addRoleToUser(userId, roleId);
        if(result==1){
            return "成功";
        }else {
            return "失败";
        }
    }

    @Override
    public String addResourceToRole(int roleId,int resourceId){
        int result=resourceDao.addResourceToRole(roleId, resourceId);
        return null;
    }

    @Override
    public Map<User_resource, List<User_resource>> getMenuByUser(int userId) {
        return null;
    }
}

