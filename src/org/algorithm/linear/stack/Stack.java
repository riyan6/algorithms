package org.algorithm.linear.stack;

import java.util.Iterator;

/**
 * @Author caopz
 * @Date 2020/8/23
 * @Description: 栈
 */
public class Stack<T> implements Iterable<T> {

    private Node<T> head;

    private int len;

    public Stack() {
        this.head = new Node(null, null);
        this.len = 0;
    }

    /**
     * 判断栈是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return len == 0;
    }

    /**
     * 获取栈的长度
     *
     * @return
     */
    public int size() {
        return len;
    }

    /**
     * 压栈
     */
    public void push(T t) {
        // 找到head指向的下一个节点
        Node oldFirst = head.next;
        // 创建新节点
        // 新节点指向原来的head下一个节点
        Node<T> newNode = new Node<>(t, oldFirst);
        // head指向新节点
        head.next = newNode;
        // 个数加一
        len++;
    }


    /**
     * 弹栈
     *
     * @return
     */
    public T pop() {
        // 找到第一个节点
        Node first = head.next;
        if (first == null) {
            return null;
        }
        // 找到第二个节点
        Node second = first.next;
        // 让head指向第二个节点
        head.next = second;
        // 元素个数减一
        len--;
        // 返回结果
        return (T) first.val;
    }

    @Override
    public Iterator<T> iterator() {
        return new TIteator();
    }

    private class TIteator implements Iterator {

        private Node node;

        public TIteator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public Object next() {
            node = node.next;
            return node.val;
        }
    }
}
