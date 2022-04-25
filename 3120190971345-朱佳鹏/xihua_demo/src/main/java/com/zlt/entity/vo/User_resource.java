package com.zlt.entity.vo;

public class User_resource {
    private int user_Id;
    private int Parent_id;
    private int Resource_id;
    private String Resource_name;

    public int getUser_Id() {
        return user_Id;
    }

    public void setUser_Id(int user_Id) {
        this.user_Id = user_Id;
    }

    public int getParent_id() {
        return Parent_id;
    }

    public void setParent_id(int parent_id) {
        Parent_id = parent_id;
    }

    public int getResource_id() {
        return Resource_id;
    }

    public void setResource_id(int resource_id) {
        Resource_id = resource_id;
    }

    public String getResource_name() {
        return Resource_name;
    }

    public void setResource_name(String resource_name) {
        Resource_name = resource_name;
    }
}
