package org.algorithm.example;

/**
 * @Author caopz
 * @Date 2020/8/29
 * @Description: 快速排序
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 6, 9, 2};
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(arr, lo, hi);
        sort(arr, lo, j - 1);
        sort(arr, j + 1, hi);
    }

    private static int partition(int[] arr, int lo, int hi) {
        // 将数组切分成arr[lo...i-1], arr[i], arr[i+1...hi]
        int i = lo, j = hi + 1;
        int v = arr[lo];
        while (true) {
            // 扫描左右，检查扫描是否结束并交接元素
            while (v > arr[++i]) {
                if (i == hi) {
                    break;
                }
            }
            while (arr[--i] > v) {
                if (j == lo) {
                    break;
                }
            }
            if (i >= j) {
                break;
            }
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        int temp = arr[lo];
        arr[lo] = arr[j];
        arr[j] = temp;
        return j;
    }

}
