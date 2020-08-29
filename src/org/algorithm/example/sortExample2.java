package org.algorithm.example;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/29
 * @Description: 练习2
 */
public class sortExample2 {

    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 6, 9, 2};
//        selectionSort(arr);
//        insertionSort(arr);
        shellSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    // 希尔排序
    private static void shellSort(int[] arr) {
        int h = 1;
        while (h < arr.length / 3) {
            h = 3 * h + 1;
        }
        while (h >= 1) {
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

    // 插入排序
    private static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0 && arr[j - 1] > arr[j]; j--) {
                int temp = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = temp;
            }
        }
    }

    // 选择排序
    private static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

}
