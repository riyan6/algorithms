package org.algorithm.linear.twoway;

import java.util.Iterator;

/**
 * @Author caopz
 * @Date 2020/8/22
 * @Description: 双向链表
 */
public class TowWayLinkList<T> implements Iterable {

    private Node head;

    private Node last;

    private Integer len;

    public TowWayLinkList() {
        // 初始化头结点和尾节点
        head = new Node(null, null, null);
        last = null;
        // 初始化长度
        len = 0;
    }

    /**
     * 清空链表
     */
    public void clear() {
        head.next = null;
        last = null;
        len = 0;
    }

    /**
     * 获取链表长度
     *
     * @return
     */
    public int len() {
        return len;
    }

    /**
     * 判断链表是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return len == 0;
    }

    /**
     * 获取头结点
     *
     * @return
     */
    public T getFirst() {
        if (isEmpty()) {
            return null;
        }
        return (T) head.next.val;
    }

    /**
     * 获取尾节点
     *
     * @return
     */
    public T getLast() {
        if (isEmpty()) {
            return null;
        }
        return (T) last.val;
    }

    /**
     * 插入数据
     *
     * @param t
     */
    public void insert(T t) {
        if (isEmpty()) {
            // 创建新节点
            Node<T> newNode = new Node<>(t, head, null);
            // last 变为新节点
            last = newNode;
            // head指向next
            head.next = last;
        } else {
            // 接收老的尾节点
            Node oldLast = last;
            // 创建新节点
            Node<T> newNode = new Node<>(t, oldLast, null);
            // 当前尾节点指向新节点
            oldLast.next = newNode;
            // 让新节点成为尾节点
            last = newNode;
        }
        // 元素个数加一
        len++;
    }

    /**
     * 指定位置处插入元素
     *
     * @param n
     * @param t
     */
    public void insert(int n, T t) {
        // 找到n位置的前一个节点
        Node prev = head;
        for (int i = 0; i < n; i++) {
            prev = head.next;
        }
        // 找到n位置的节点
        Node current = prev.next;
        // 创建新节点
        Node<T> newNode = new Node<>(t, prev, current);
        // 让n位置的前一个节点指向新节点
        prev.next = newNode;
        // 让原来n位置节点的前一个节点变成新节点
        current.prev = newNode;
        // 元素个数加一
        len++;
    }

    /**
     * 获取到某处的值
     *
     * @param n
     * @return
     */
    public T get(int n) {
        // 从第二个开始就能准确找到
        Node node = head.next;
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return (T) node.val;
    }

    /**
     * 找到元素在链表中的位置
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        Node node = head;
        for (int i = 0; node.next != null; i++) {
            node = node.next;
            if (node.next.equals(t)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 删除某处的元素
     *
     * @param n
     * @return
     */
    public T remove(int n) {
        // 找到n位置的前一个节点
        Node prev = head;
        for (int i = 0; i < n; i++) {
            prev = prev.next;
        }
        // 找到n位置的节点
        Node current = prev.next;
        // 找到n位置的下一个节点
        Node next = current.next;
        // 让 n位置的上一个节点 next指向 n位置的下一个节点
        prev.next = next;
        // 让 n位置的下一个节点 prev指向 n位置的上一个节点
        next.prev = prev;
        // 元素数量减一
        len--;
        // 返回
        return (T) current.val;
    }


    @Override
    public Iterator iterator() {
        return new TIterator();
    }

    private class TIterator implements Iterator {

        private Node node;

        public TIterator() {
            this.node = head;
        }

        @Override
        public boolean hasNext() {
            return node.next != null;
        }

        @Override
        public Object next() {
            node = node.next;
            return node;
        }
    }

}
