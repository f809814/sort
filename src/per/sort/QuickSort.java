package per.sort;

import java.util.Arrays;

/**
 * @author fu
 * @date 2018/12/31 - 22:08
 */
public class QuickSort extends Sort{
    /**
     * 排序算法：快速排序(结束时从小到大排序)
     * 不稳定
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array) {
        sortImpl(array,0,array.length - 1);
    }

    private void sortImpl(int[] array, int low , int high) {
        if(array == null || array.length == 0)
            return;
        if(low >= high)
            return;
        int left = low, right = high;
        int temp = array[low];//设置最左边为基准值
        while (left < right){
            while (left < right && array[right] >= temp){
                right--;
            }
            array[left] = array[right];
            while (left < right && array[left] <= temp){
                left++;
            }
            array[right] = array[left];
        }
        array[right] = temp;//此时基准值的位置确定
        //System.out.println("array:" + Arrays.toString(array));
        sortImpl(array, low,left - 1 );
        sortImpl(array,left + 1, high);
    }

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        quickSort.test();
    }
}
