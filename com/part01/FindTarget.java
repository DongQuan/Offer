package com.part01;

/**
 * Created by Dong on 2017/3/2.
 * 在二维数组中，每一行都按照从左到右递增，每一列都按照从上到下递增，
 * 完成一个函数，输入这样的一个二维数组(array)和一个整数(target)，
 * 判断target是不是在array中。
 */
public class FindTarget {
    /**
     * array是有序的，所以先从左下角开始查找，当target比左下小时，上移
     * 比左下大时，右移
     * @param array 输入有序二维数组
     * @param target 需要查找的目标整数
     * @return
     */
    public boolean find(int[][] array, int target){
        int row = array.length;
        for (int i=row-1, j=0; i>=0 && j<=array[0].length-1;) {
            if (target == array[i][j])
                return true;
            else if (target < array[i][j]) {
                i--;
                continue;
            } else {
                j++;
                continue;
            }
        }
        return false;
    }

    /**
     * 在每一行进行二分查找
     * @param array 输入有序二维数组
     * @param target 需要查找的目标整数
     * @return
     */
    public boolean findBinSearch(int[][] array, int target){
        for (int i=0; i<array.length; i++){
            int low = 0;
            int high = array[0].length-1;

            while (low <= high){
                int mid = (low + high) / 2;
                if (target > array[i][mid]){
                    low = mid + 1;
                }else if (target < array[i][mid]){
                    high = mid - 1;
                }else {
                    return true;
                }
            }
        }
        return false;
    }
}
