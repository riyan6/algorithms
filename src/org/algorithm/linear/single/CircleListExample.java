package org.algorithm.linear.single;

/**
 * @Author caopz
 * @Date 2020/8/23
 * @Description: 链表是否有环问题
 */
public class CircleListExample {

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

        // 产生环
        seven.next = fourth;

        // 查找中间值
        boolean result = isCirle(first);
        System.out.println("是否有环：" + result);
    }

    /**
     * 判断链表是否有闭环
     *
     * @param first
     * @return
     */
    private static boolean isCirle(Node<String> first) {
        // 定义快指针和慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        // 遍历链表，如果快慢指针指向了同一个节点 那么证明有环
        while (fast != null && fast.next != null) {
            // 快指针移动两次
            fast = fast.next.next;
            // 慢指针移动一次
            slow = slow.next;
            // 如果两个相等
            if (fast.equals(slow)) {
                return true;
            }
        }
        return false;
    }

}
