package org.algorithm.sort;

/**
 * @Author caopz
 * @Date 2020/8/8
 * @Description: 冒泡排序算法类
 */
public class Bubble {

    /**
     * 冒泡排序
     *
     * @param arr
     */
    public static void sort(Comparable[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (max(arr[j], arr[j + 1])) {
                    exec(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * 判断值1是否大于值2
     *
     * @param var1
     * @param var2
     * @return
     */
    public static boolean max(Comparable var1, Comparable var2) {
        return var1.compareTo(var2) > 0;
    }

    /**
     * 交换数组中这两个索引的值
     *
     * @param arr
     * @param var1
     * @param var2
     */
    public static void exec(Comparable[] arr, int var1, int var2) {
        Comparable temp;
        temp = arr[var1];
        arr[var1] = arr[var2];
        arr[var2] = temp;
    }

}
