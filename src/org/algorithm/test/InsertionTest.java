package org.algorithm.test;

import org.algorithm.sort.Insertion;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/8
 * @Description: 插入排序测试
 */
public class InsertionTest {

    /**
     * 插入排序：将数据分为2组，一组为排序好的，一组为未排序的。每次循环将未排序的数插入到排序好的一组去比较大小，
     * 进行排序，找到合适的位置插入，直到全部插入完毕。
     * <p>
     * 比较次数：N^2 / 2 - N/2
     * 交换次数：N^2 / 2- N/2
     * 执行： N^2 - N
     * <p>
     * 效率：O(N^2)
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 6, 9, 2};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
