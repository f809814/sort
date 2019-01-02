package per.sort;

/**
 * @author fu
 * @date 2018/12/31 - 22:07
 */
public class BubbleSort extends Sort{
    /**
     * 排序算法：冒泡排序(结束时从小到大排序)
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array){
        if(array == null || array.length == 0)
            return;
        for (int i = 0; i < array.length ; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if(array[j] > array[j + 1])
                    swap(array, j,j + 1);
            }
        }
    }

    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        bubbleSort.test();
    }
}
