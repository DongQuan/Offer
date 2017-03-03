package com.part02;

/**
 * 一只青蛙一次可以跳一级台阶，也可以跳两级。
 * 求该青蛙跳上一个n级的台阶一共有几种方法。
 * 思路：1、若青蛙第一次跳上一级台阶，则剩下n-1级台阶，剩下跳法f(n-1)
 *      2、若青蛙第一次跳上2级台阶，则剩下n-2级台阶，剩下跳法f(n-2)
 *      3、则n级台阶跳法为：f(n)=f(n-1)+f(n-2)
 *      4、则f(n)=1[n=1];2[n=2];f(n-1)+f(n-2)[n>2]
 *      综上：这是个斐波那契数列。
 * Created by Dong on 2017/3/3.
 */
public class JumpFloor {
    public int jumpFloor(int target){
        if(target <= 0)
            return 0;

        if (target < 2)
            return target;
        if (target == 2)
            return 2;

        int[] record = new int[target+1];
        record[1] = 1;
        record[2] = 2;
        for (int i = 3; i<=target; i++){
            record[i] = record[i-1]+record[i-2];
        }
        return record[target];

        /*
        int fn_1 = 0;
        int fn_2 = 1;
        int tmp = 0;
        for (int i = 2; i <= target; i++){
            tmp = fn_2;
            fn_2 = fn_1+fn_2;
            fn_1 = tmp;
        }
        return fn_2;
        */
    }
}
