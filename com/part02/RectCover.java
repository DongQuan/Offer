package com.part02;

/**
 * 我们可以用'2*1'的小矩阵横着或者竖着去覆盖更大的矩形。
 * 问：用n个'2*1'的小矩阵无重叠地覆盖一个'2*n'的大矩阵，总共有多少方法？
 * 思路：1、target=1,f(1)=1;
 *      2、target=2,f(2)=2;
 *      3、target=n时,第一块竖放，剩下有f(n-1)种放置方法;
 *         第一块横放，则下方空间也得横放一块矩形，剩下有f(n-2)种放置方法;
 *         则f(n)=f(n-1)+f(n-2);
 *      综上，为斐波那契数列。
 * Created by Dong on 2017/3/3.
 */
public class RectCover {
    public int rectCover(int target){
        if (target <= 0){
            return 0;
        }else if (target == 1){
            return 1;
        }else if (target == 2){
            return 2;
        }else {
            int[] record = new int[target+1];
            record[1] = 1;
            record[2] = 2;
            for (int i = 3; i<=target; i++){
                record[i] = record[i-1]+record[i-2];
            }
            return record[target];
        }
    }
}
