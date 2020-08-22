package org.algorithm.linear.single;

/**
 * @Author caopz
 * @Date 2020/8/22
 * @Description: 链表节点
 */
public class Node<T> {

    public T val;

    public Node next;

    public Node(T val, Node next) {
        this.val = val;
        this.next = next;
    }
}
