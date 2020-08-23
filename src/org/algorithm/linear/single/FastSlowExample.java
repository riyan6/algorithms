package org.algorithm.linear.single;

/**
 * @Author caopz
 * @Date 2020/8/23
 * @Description: 快慢指针 测试例子
 */
public class FastSlowExample {

    public static void main(String[] args) {
        // 创造节点
        Node<String> first = new Node<>("aa", null);
        Node<String> second = new Node<>("bb", null);
        Node<String> third = new Node<>("cc", null);
        Node<String> fourth = new Node<>("dd", null);
        Node<String> fifth = new Node<>("ee", null);
        Node<String> six = new Node<>("ff", null);
        Node<String> seven = new Node<>("gg", null);
        // 设置关系
        first.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        six.next = seven;

        // 查找中间值
        String mid = getMid(first);
        System.out.println("中间值为：" + mid);
    }

    /**
     * 查找中间值
     *
     * @param first
     * @return
     */
    private static String getMid(Node<String> first) {
        // 定义快指针和慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        // 使用两个指针遍历链表 快指针到的节点没有下一个节点了 说明快指针已经到了链表结尾 此时慢指针就是链表的中间值
        while (fast != null && fast.next != null) {
            // 快指针移动两次
            fast = fast.next.next;
            // 慢指针移动一次
            slow = slow.next;
        }
        return slow.val;
    }

}
