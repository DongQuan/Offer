package com.Test;

import com.part01.FindTarget;
import com.part01.ReConstructBinaryTree;
import com.part02.*;

import java.util.ArrayList;

/**
 * Created by Dong on 2017/3/3.
 */
public class Test_0303 {
    public static void main(String[] args) {
//        System.out.println("===============StackToList===========");
//        StackToList st = new StackToList();
//        st.push(2);
//        st.push(4);
//        st.push(5);
//        System.out.println(st.pop());
//        System.out.println(st.pop());
//        System.out.println(st.pop());

        System.out.println("===============MinNumberInRotateArray===========");
        int[] array = new int[]{2,2,2,0,2,2};
        MinNumberInRotateArray mi = new MinNumberInRotateArray();
        System.out.println(mi.minNumberInRotateArray(array));

        System.out.println("===============Fibonacci===========");
        Fibonacci fi = new Fibonacci();
        System.out.println(fi.fibonacci(100));

        System.out.println("===============JumpFloor===========");
        JumpFloor jf = new JumpFloor();
        System.out.println(jf.jumpFloor(10));

        System.out.println("===============JumpFloorII===========");
        JumpFloorII jfi = new JumpFloorII();
        System.out.println(jfi.jumpFloor(32));

        System.out.println("===============RectCover===========");
        RectCover rc = new RectCover();
        System.out.println(rc.rectCover(10));
    }
}
