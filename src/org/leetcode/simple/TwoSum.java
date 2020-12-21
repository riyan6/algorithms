package org.leetcode.simple;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author cpz
 * @Date 2020/12/14
 * @Description: 两数之和
 * @Link: https://leetcode-cn.com/problems/two-sum
 */
public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        int[] result = Solution(arr, target);
        System.out.println(Arrays.toString(result));
    }

    private static int[] Solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                return new int[] {map.get(diff), i};
            } else {
                map.put(nums[i], i);
            }
        }
        return new int[] {0, 0};
    }

}
