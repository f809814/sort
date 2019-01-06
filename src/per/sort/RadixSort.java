package per.sort;


/**
 * @author fu
 * @date 2019/1/4 - 18:43
 */
public class RadixSort extends Sort {
    /**
     * 排序算法：基数排序(结束时从小到大排序)
     * 稳定
     *
     * @param array 待排序数组
     */
    @Override
    public void sort(int[] array) {
        if (array == null || array.length < 0) {
            return;
        }

        int max = array[0];
        for (int i = 0; i <array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        int maxDigit = 0;
        while (max != 0) {
            max = max / 10;
            maxDigit++;
        }
        //System.out.println("maxDigit, " + maxDigit);

        int[][] buckets = new int[10][array.length];
        int base = 10;

        //从低位到高位，对每一位遍历，将所有元素分配到桶中
        for (int i = 0; i < maxDigit; i++) {
            int[] bucketLen = new int[10];  //存储各个桶中存储元素的数量

            //分配：将数据放入桶内
            for (int j = 0; j < array.length; j++) {
                int whichBucket = (array[j] % base) / (base / 10);
                buckets[whichBucket][bucketLen[whichBucket]] = array[j];
                bucketLen[whichBucket]++;
            }

            int k = 0;
            //收集：将不同桶里数据挨个捞出来,为下一轮高位排序做准备,由于靠近桶底的元素排名靠前,因此从桶底先捞
            for (int l = 0; l < buckets.length; l++) {
                for (int m =0; m < bucketLen[l]; m++) {
                    array[k++] = buckets[l][m];
                }
            }
            //System.out.println("Sorting: " + Arrays.toString(array));
            base *= 10;
        }
    }

    public static void main(String[] args) {
        RadixSort radixSort = new RadixSort();
        radixSort.test();
    }
}
