package org.algorithm.linear.single;

/**
 * @Author caopz
 * @Date 2020/8/23
 * @Description: 获取闭环链表的入口
 */
public class CircleListInExample {

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
        seven.next = third;

        // 查找中间值
        Node<String> result = getEntrance(first);
        System.out.println("环入口：" + result.val);
    }

    /**
     * 获取到环的入口
     *
     * @param first
     * @return
     */
    private static Node<String> getEntrance(Node<String> first) {
        // 定义快指针和慢指针
        Node<String> fast = first;
        Node<String> slow = first;
        Node<String> temp = null;
        // 遍历链表，如果快慢指针指向了同一个节点（相遇）准备一个临时指针 指向链表头部 直到慢指针和临时指针 相遇，相遇点就是环入口
        while (fast != null && fast.next != null) {
            // 快指针移动两次
            fast = fast.next.next;
            // 慢指针移动一次
            slow = slow.next;
            // 如果两个相等
            if (fast.equals(slow)) {
                // 临时指针开始
                temp = first;
                // 跳出这个循环
                continue;
            }
            // 让临时节点开始行动
            if (temp != null){
                temp = temp.next;
                // 判断临时指针和慢指针是否相遇
                if (temp.equals(slow)){
                    break;
                }
            }

        }
        return temp;
    }

}
