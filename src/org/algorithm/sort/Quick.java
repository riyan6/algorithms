package org.algorithm.sort;

/**
 * @Author caopz
 * @Date 2020/8/15
 * @Description: 快速排序
 */
public class Quick {

    public static void sort(int[] arr) {
        int min = 0;
        int max = arr.length - 1;
        sort(arr, min, max);
    }

    public static void sort(int[] arr, int min, int max) {
        // 安全性校验
        if (max <= min) {
            return;
        }
        // 需要从min - max的元素进行分组，为左子组和右子组
        int partition = partition(arr, min, max);

        // 让左子组有序
        sort(arr, min, partition - 1);

        // 让右子组有序
        sort(arr, partition + 1, max);

    }

    /**
     * 在数组arr中 从min到max之间的元素进行分组 并返回分组间限对应的索引
     *
     * @param arr
     * @param min
     * @param max
     * @return
     */
    public static int partition(int[] arr, int min, int max) {
        // 中间值
        int key = arr[min];
        // 设置两个key
        int left = min;
        int right = max + 1;
        // 进行排序
        while (true) {
            // 从右边找到比key值小的数值， 停止，就是要找到比key大的值
            while (key < arr[--right]) {
                if (right == min) {
                    break;
                }
            }
            // 从左边找到比key值大的数值， 停止，就是要找到比key小的值
            while (arr[++left] < key) {
                if (left == max) {
                    break;
                }
            }
            // 判断left >= right，如果是说明扫描完毕结束循环，如果不是交换数据
            if (left >= right) {
                break;
            } else {
                swap(arr, left, right);
            }
        }
        // 交换中间值
        swap(arr, min, right);
        return right;
    }

    /**
     * 交换位置
     *
     * @param arr
     * @param i
     * @param j
     */
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
