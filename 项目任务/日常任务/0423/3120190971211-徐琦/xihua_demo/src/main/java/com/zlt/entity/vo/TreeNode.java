package com.zlt.entity.vo;

import java.util.List;

public class TreeNode {
    private int id;
    private String name;
    private int pid;
    private List<TreeNode> childNode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int pid) {
        this.pid = pid;
    }

    public List<TreeNode> getChildNode() {
        return childNode;
    }

    public void setChildNode(List<TreeNode> childNode) {
        this.childNode = childNode;
    }
}
