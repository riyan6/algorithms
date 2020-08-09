package org.algorithm.sort;

/**
 * @Author caopz
 * @Date 2020/8/9
 * @Description: 希尔排序
 */
public class Shell {

    /**
     * 希尔排序
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        // 设置增量h
        int h = 1;
        while (h < arr.length / 2) {
            h = 2 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (arr[j - h] > arr[j]) {
                        exec(arr, j - h, j);
                    } else {
                        break;
                    }
                }
            }
            h = h / 2;
        }
    }

    /**
     * 交换数组中这两个索引的值
     *
     * @param arr
     * @param var1
     * @param var2
     */
    public static void exec(int[] arr, int var1, int var2) {
        int temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

}
