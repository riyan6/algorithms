package org.algorithm.linear.queue;

/**
 * @Author caopz
 * @Date 2020/8/27
 * @Description: 节点
 */
public class Node<T> {

    public T val;

    public Node next;

    public Node(T val, Node next) {
        this.val = val;
        this.next = next;
    }
}
