package org.algorithm.linear.twoway;

/**
 * @Author caopz
 * @Date 2020/8/22
 * @Description: 双向链表节点
 */
public class Node<T> {

    T val;

    Node prev;

    Node next;

    public Node(T val, Node prev, Node next) {
        this.val = val;
        this.prev = prev;
        this.next = next;
    }
}
