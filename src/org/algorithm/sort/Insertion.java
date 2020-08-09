package org.algorithm.sort;

/**
 * @Author caopz
 * @Date 2020/8/8
 * @Description: 插入排序
 */
public class Insertion {

    /**
     * 排序方法
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j - 1] > arr[j]) {
                    exec(arr, j - 1, j);
                } else {
                    break;
                }
            }
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
