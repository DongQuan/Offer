package com.part02;

/**
 * 输入一个整数n，输出斐波那契数列的第n项。
 * 斐波那契数列：1，1，2，3，5...后一个元素为前两个元素之和。
 * Created by Dong on 2017/3/3.
 */
public class Fibonacci {
    public int fibonacci(int n){
        if ( n<0 || n>39){
            return -1;
        }

        /*
        //方法一：递归，不好的方法，当n特别大的时候，会因为重复计算而Stack overflow。
        if (n < 2){
            return n;
        }else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
        */

        /*
        //方法二：迭代：
        if (n < 2){
            return n;
        }

        int first = 0;
        int second = 1;
        int tmp = 0;
        for (int i = 2; i <= n; i++){
            tmp = second;
            second = first+second;
            first = tmp;
        }

        return second;
        */

        //方法三：动态规划：避免代价更大的重复计算的栈空间浪费
        if (n <= 1)
            return n;

        int[] record = new int[n+1];
        record[0] = 0;
        record[1] = 1;
        for (int i = 2; i <= n; i++){
            record[i]=record[i-1] + record[i-2];
        }
        return record[n];
    }
}
