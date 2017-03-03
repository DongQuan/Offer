package com.Test;

import com.dataStruct.BinaryTree;
import com.part01.FindTarget;
import com.dataStruct.ListNode;
import com.part01.PrintTailToHeadOfList;
import com.part01.ReConstructBinaryTree;
import com.part01.ReplaceSpace;

import java.util.ArrayList;

/**
 * Created by Dong on 2017/3/2.
 */
public class Test {
    public static void main(String[] args){
        System.out.println("==========FindTarget============");
        int[][] array=new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        FindTarget ft = new FindTarget();
        boolean result = ft.find(array, 0);
        System.out.println(result);

        System.out.println("------------------------");
        boolean rs = ft.findBinSearch(array, 0);
        System.out.println(rs);

        System.out.println("==========ReplaceSpace============");
        ReplaceSpace rsp = new ReplaceSpace();
        StringBuffer stb = new StringBuffer("I am good.");
        StringBuffer res = new StringBuffer();

        res = rsp.replaceSpace(stb);
        System.out.println(res);

        System.out.println("==========PrintTailToHeadOfList============");
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        listNode1.next =listNode2;
        ListNode listNode3 = new ListNode(3);
        listNode2.next = listNode3;
        ListNode listNode4 = new ListNode(4);
        listNode3.next = listNode4;

        PrintTailToHeadOfList ptt = new PrintTailToHeadOfList();
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = ptt.printTailToHeadOfList(listNode1);
        System.out.println(list);

        list = ptt.stackPrintTailToHead(listNode1);
        System.out.println(list);

        System.out.println("==========ReConstructBinaryTree============");
        int[] pre = new int[]{1,2,4,7,3,5,6,8};
        int[] mid = new int[]{4,7,2,1,5,3,8,6};

        ReConstructBinaryTree rcbt = new ReConstructBinaryTree();
        BinaryTree node;
        node = rcbt.reConstructBinaryTree(pre, mid);

        rcbt.printBintry(node);
    }
}
