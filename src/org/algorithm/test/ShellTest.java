package org.algorithm.test;

import org.algorithm.sort.Shell;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/9
 * @Description: 希尔排序测试
 */
public class ShellTest {

    /**
     * 希尔排序
     * 比如一个数组为，生成一个增量为3。就会分为3组进行比较：7和6、5和9、1和2。比较完毕后。
     * 数组为{6,5,1,7,9,2}，然后增量为1，就会分为与加的变量比较、、、编不下去了。。。。。
     * 反正希尔排序效率很高就完事了
     *
     *
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] arr = {7, 5, 1, 6, 9, 2};
        Shell.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
