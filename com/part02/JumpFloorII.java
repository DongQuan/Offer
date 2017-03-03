package com.part02;

/**
 * 一只青蛙一次可以跳一级台阶，也可以跳两级,也可以跳上n级台阶。
 * 求该青蛙跳上一个n级的台阶一共有几种方法。
 * 思路：1、若青蛙第一次只跳一级，剩下n-1级，有f(n-1)跳法
 *      2、若青蛙第一次只跳2级，剩下n-2级，有f(n-2)跳法
 *      3、所以f(n)=f(n-1)+f(n-2)+...+f(1)
 *      4、f(n-1)=f(n-2)+f(n-3)+...+f(1)
 *      5、所以f(n)=2*f(n-1)
 *      综上，f(0)=1;f(1)=1;f(2)=2...f(n)=2*f(n-1)
 * Created by Dong on 2017/3/3.
 */
public class JumpFloorII {
    //移位也能计算，2^n-1.左移移位，*2.代码：1<<(n-1);
    //递归算法有问题,时间开销大？
    public int jumpFloor(int n){
        if (n <= 0){
            return -1;
        }else if (n == 1){
            return 1;
        }else {
            return 2*jumpFloor(n-1);
        }
    }
}
