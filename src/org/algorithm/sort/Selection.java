package org.algorithm.sort;

/**
 * @Author caopz
 * @Date 2020/8/8
 * @Description: 选择排序
 */
public class Selection {

    /**
     * 选择排序
     *
     * @param arr
     */
    public static void sort(int[] arr) {
        // 最后一个数不参与循环
        for (int i = 0; i <= arr.length - 1 - 1; i++) {
            // 假设每次循环第一个数为最小数下标
            int minIndex = i;
            // 假设完第一个数后，循环后面剩余的数，一直循环比较求出最小的最小数
            for (int j = i + 1; j < arr.length; j++) {
                // 如果发现有比假设最小数大的数，说明假设的数不是最小数，
                if (arr[minIndex] > arr[j]) {
                    // 记录下真正的最小数下标
                    minIndex = j;
                }
            }
            // 将现在在循环数和最小数进行交换位置
            exec(arr, i, minIndex);
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
