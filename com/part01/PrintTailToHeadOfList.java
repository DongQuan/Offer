package com.part01;

import com.dataStruct.ListNode;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 输入一个链表，从尾到头打印每个节点的值
 * Created by Dong on 2017/3/2.
 */
public class PrintTailToHeadOfList {
    /**
     * 借助递归实现，本质还是堆栈的结构
     * @param listNode
     * @return
     */
    public ArrayList<Integer> printTailToHeadOfList(ListNode listNode){
        ArrayList<Integer> list = new ArrayList<Integer>();

        ListNode pNode = listNode;
        if (pNode != null){
            if (pNode.next != null){
                list = printTailToHeadOfList(pNode.next);
            }
            list.add(pNode.val);
        }

        return list;
    }

    /**
     * Stack<E>是堆栈容器。有pop(),push(),empty(),peek()[查看栈顶部对象，但不移除],
     * search(Object o)[返回o在堆栈中的位置，以1为基数]
     * @param listNode
     * @return
     */
    public ArrayList<Integer> stackPrintTailToHead(ListNode listNode){
        Stack<Integer> stack = new Stack<Integer>();
        ArrayList<Integer> list =new ArrayList<Integer>();

        while (listNode!= null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }

        while (!stack.empty()){
            list.add(stack.pop());
        }

        return list;
    }
}