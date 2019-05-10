package com.example.pattern_composite.example_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 数节点声明
 */
public class TreeNode {
    private String name;
    private TreeNode parent;
    private List<TreeNode> children = new ArrayList<>();

    public TreeNode(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }

    public void add(TreeNode treeNode) {
        children.add(treeNode);
    }

    public void remove(TreeNode treeNode) {
        children.remove(treeNode);
    }

    public Iterator<TreeNode> getChildren() {
        return children.iterator();
    }
}
