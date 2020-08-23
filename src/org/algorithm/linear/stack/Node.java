package org.algorithm.linear.stack;

/**
 * @Author caopz
 * @Date 2020/8/23
 * @Description: 栈节点
 */
public class Node<T> {

    public T val;

    public Node next;

    public Node(T val, Node next) {
        this.val = val;
        this.next = next;
    }

}
