package com.part02;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的push和pop操作
 * Created by Dong on 2017/3/3.
 */
public class StackToList {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node){
        stack1.push(node);
    }

    public int pop(){
        if (stack1.empty() && stack2.empty()){
            throw new RuntimeException("Queue is empty.");
        }

        if (stack2.empty()){
            while (!stack1.empty()){
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}
