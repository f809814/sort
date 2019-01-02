package per.sort;

/**
 * @author fu
 * @date 2019/1/2 - 19:34
 */
public class InsertSort extends Sort{
    /**
     * 排序算法：直接插入排序(结束时从小到大排序)
     * 稳定
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array) {
        if(array == null || array.length == 0)
            return;
        for (int i = 1; i < array.length; i++) {
            for (int j = i ; j > 0; j--) {
                if(array[j] < array[j - 1]){
                    swap(array, j, j - 1);//当前位置小于前一位置则交换
                } else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        InsertSort insertSort = new InsertSort();
        insertSort.test();
    }
}
