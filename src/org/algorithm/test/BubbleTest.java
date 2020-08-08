package org.algorithm.test;

import org.algorithm.sort.Bubble;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/8
 * @Description: 冒泡排序测试类
 */
public class BubbleTest {

    /**
     * 冒泡排序：最坏情况 {6, 5, 4, 3, 2, 1}
     * 元素比较次数：(N-1) + (N-2) + ... + 2 + 1 = ((N - 1) + 1) * (N - 1) / 2 = N^2 / 2- N/2
     * 元素交换...
     * 总执行次数： (N^2 / 2 - N) + (N^2 / 2 - N / 2)= N^2 - N
     * 根据大O推导法则，保留函数中最高阶最终时间复杂度为 O(N^2)
     *
     * 冒泡排序数据量一多，性能差劲！
     *
     * @param args
     */
    public static void main(String[] args) {
        Integer[] arr = {7, 5, 1, 6, 9, 2};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
