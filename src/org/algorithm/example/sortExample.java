package org.algorithm.example;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/25
 * @Description: 825排序练习
 */
public class sortExample {

    public static void main(String[] args) {
         
        // 5 7 1 6 9 2
        // 5 1 7 6 9 2
        // 1 5 7 6 9 2
        // ...
//        selectionSort(arr);
//        insertionSort(arr);
//        shellSort(arr);
//        System.out.println(Arrays.toString(arr));
    }

    private static void shellSort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
            // 将数组变为h有序
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h && arr[j - h] > arr[j]; j -= h) {
                    int temp = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = temp;
                }
            }
            h = h / 3;
        }
    }

    /**
     * 插入排序
     * 对付小规模数组有效
     * 或者部分元素有序 有奇效
     *
     * @param arr
     */
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    /**
     * 选择排序
     *
     * @param arr
     */
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            // 假设最小值下标为0
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    // 说明min不是最小值的下标
                    min = j;
                }
            }
            // 交换位置
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }


}
