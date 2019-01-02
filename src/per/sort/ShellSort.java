package per.sort;

/**
 * @author fu
 * @date 2019/1/2 - 20:07
 */
public class ShellSort extends Sort {
    /**
     * 排序算法：希尔排序(结束时从小到大排序)
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array) {
        if(array == null || array.length == 0)
            return;
        int length = array.length;
        for (int step = length / 2; step > 0; step = step / 2) {
            for (int i = 0; i < step; i++) {
                //对每组数据分别进行直接插入排序
                for (int j = i; j < length - step; j += step) {
                    for (int k = j; k >= i; k -= step) {
                        if(array[k] > array[k + step]) {
                            swap(array,k,k + step);
                        } else break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        ShellSort shellSort = new ShellSort();
        shellSort.test();
    }
}
