package com.dataStruct;

/**
 * 二叉树定义
 * Created by Dong on 2017/3/2.
 */
public class BinaryTree {
    public int root;
    public BinaryTree leftTree = null, rightTree = null;

    public BinaryTree(int root){
        this.root = root;
    }
}
