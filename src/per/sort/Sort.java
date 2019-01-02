package per.sort;

import java.util.Arrays;

/**
 * 排序算法父类，sort()为具体排序算法，test()为测试方法
 *
 * @author fu
 * @date 2018/12/31 - 23:20
 */
abstract public class Sort {
    abstract public void sort(int[] array);
    public static void swap(int[] arr,int i,int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    void test(){
        int[] test1 = {1};
        int[] test2 = {2,1};
        int[] test3 = {1,1,3,4,5,6};
        int[] test4 = {9,8,7,6,5,4,3,2,1};
        int[] test5 = {8,7,6,5,4,3,2,9,1};
        sort(test1);
        sort(test2);
        sort(test3);
        sort(test4);
        sort(test5);
        System.out.println("test1:" + Arrays.toString(test1));
        System.out.println("test2:" + Arrays.toString(test2));
        System.out.println("test3:" + Arrays.toString(test3));
        System.out.println("test4:" + Arrays.toString(test4));
        System.out.println("test5:" + Arrays.toString(test5));
    }
}
