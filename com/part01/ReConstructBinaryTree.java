package com.part01;

import com.dataStruct.BinaryTree;
import com.sun.tools.javac.code.Attribute;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，重建出该二叉树。
 *假设两次遍历结果都不会出现重复数字。
 * Created by Dong on 2017/3/2.
 */
public class ReConstructBinaryTree {
    /**
     * 解法：1、确定根，确定左子树，确定右子树；
     *      2、在左子树中递归
     *      3、在右子树中递归
     *      4、打印当前根
     * @param pre 前序遍历
     * @param mid 中序遍历
     * @return
     */
   public BinaryTree reConstructBinaryTree(int[] pre, int[] mid){
       if (pre.length ==0 || mid.length == 0){
           return null;
       }

       BinaryTree node = new BinaryTree(pre[0]);
       for (int i=0; i < mid.length; i++){
           if (pre[0] == mid[i]){
               node.leftTree = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i),Arrays.copyOfRange(mid, 0, i-1));
               node.rightTree = reConstructBinaryTree(Arrays.copyOfRange(pre, i+1, pre.length-1), Arrays.copyOfRange(mid, i+1, mid.length-1));
           }
       }

       return node;
   }

   public void printBintry(BinaryTree node){
       BinaryTree leftNode, rightNode;
       while (node.rightTree != null || node.rightTree != null){
           System.out.println(node.root);

       }
   }
}
