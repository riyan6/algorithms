package org.algorithm.test;

import org.algorithm.sort.Selection;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/8
 * @Description: 选择排序测试类
 */
public class SelectionTest {

    /**
     * 选择排序：
     * 1、假设第一个数为最小数，然后与其他的数进行比较，找出 真正的最小数 ，然后将 真正的最小数 交换到第一个位置
     * 2、假设第二个数为最小数，然后与其他的数进行比较，找出 真正的最小数 ，然后将 真正的最小数 交换到第二个位置
     * 3、假设第三个数为最小数，... 然后将 真正的最小数 交换到第三个位置
     * ...
     *
     * 分析：
     * 使用双层for循环，外层完成数据交互，里层循环完成数据比较
     * 比较次数：(N-1) + (N-2) + (N-3) + ... + 2 + 1 = ((N-1) + 1) * (N-1) / 2 = N^2 / 2 - N/2
     * 交换次数：N-1
     * time: N^2 / 2+N / 2-1 -> O(N^2)
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 6, 9, 2};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
