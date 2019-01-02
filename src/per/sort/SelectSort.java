package per.sort;

/**
 * @author fu
 * @date 2019/1/2 - 21:18
 */
public class SelectSort extends Sort {
    /**
     * 排序算法：选择排序(结束时从小到大排序)
     * 不稳定
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array) {
        if(array == null || array.length == 0)
            return;
        for (int i = 0; i < array.length; i++) {
            int min = i;//记录每一轮最小值下标
            for (int j = i + 1; j < array.length; j++) {
                if(array[j] < array[min])
                    min = j;
            }
            if(min != i)
                swap(array,i,min);
        }
    }

    public static void main(String[] args) {
        SelectSort selectSort = new SelectSort();
        selectSort.test();
    }
}
