package per.sort;

import java.util.Arrays;

/**
 * @author fu
 * @date 2019/1/2 - 21:33
 */
public class MergeSort extends Sort{
    /**
     * 排序算法：归并排序(结束时从小到大排序)
     * 稳定
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array) {
        if(array == null || array.length <= 1)
            return;
        int[] temp = sortImpl(array);
        System.arraycopy(temp,0,array,0,array.length);
    }

    private static int[] sortImpl(int[] arr) {
        if(arr == null || arr.length <= 1)
            return arr;
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        return mergeTwoArray(sortImpl(left), sortImpl(right));
    }

    private static int[] mergeTwoArray(int[] arr1, int[] arr2) {
        int[] mergeArr = new int[arr1.length + arr2.length];
        int flag = 0, flag1 = 0, flag2 = 0;
        while(flag1 < arr1.length && flag2 < arr2.length){
            if(arr1[flag1] <= arr2[flag2]){
                mergeArr[flag++] = arr1[flag1++];
            } else {
                mergeArr[flag++] = arr2[flag2++];
            }
        }
        while(flag1 < arr1.length)
        {
            mergeArr[flag++] = arr1[flag1++];
        }
        while(flag2 < arr2.length)
        {
            mergeArr[flag++] = arr2[flag2++];
        }
        return mergeArr;
    }

    public static void main(String[] args) {
        MergeSort mergeSort = new MergeSort();
        mergeSort.test();
    }
}
