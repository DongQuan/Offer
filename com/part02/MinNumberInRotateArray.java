package com.part02;

/**
 * 将一个数组最开始的若干个元素搬到数组的末尾，成为数组的旋转。
 * 输入一个非递减的数组的一个旋转，输出数组的最小元素。
 * 如：{34512}是{12345}的一个旋转，最小元素为1.
 * Created by Dong on 2017/3/3.
 */
public class MinNumberInRotateArray {
    public int minNumberInRotateArray(int[] array){
        if (array.length == 0 || array == null){
            return 0;
        }

        int start = 0;
        int end = array.length-1;

        if (array[start] < array[start]){
            return array[end];
        }

        while (start != end-1){
            int mid = (start+end)/2;
            if (array[start]==array[mid] && array[mid]==array[end]){
                return MinorOrder(array);
            }

            if (array[mid] >= array[start]){
                start = mid;
            }else if (array[mid] <= array[end]){
                end = mid;
            }
        }

        return array[end];
    }

    private int MinorOrder(int[] array) {
        int min = array[0];
        for (int i=0; i<array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
}
