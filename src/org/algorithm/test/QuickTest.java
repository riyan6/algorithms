package org.algorithm.test;

import org.algorithm.sort.Quick;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/8/15
 * @Description: 快速排序测试
 */
public class QuickTest {

    public static void main(String[] args) {
        int[] arr = {7,5,1,6,9,2};
        Quick.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

}
