package org.algorithm.linear.single;

/**
 * @Author caopz
 * @Date 2020/8/22
 * @Description: 单向链表、
 */
public class LinkList<T> {

    private Node<T> head;

    private Integer len;

    public LinkList() {
        this.head = new Node<T>(null, null);
        this.len = 0;
    }

    /**
     * 清除链表
     */
    public void clear() {
        head.next = null;
        len = 0;
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
     * 获取链表长度
     *
     * @return
     */
    public int len() {
        return len;
    }

    /**
     * 获取i处的元素
     *
     * @param n
     * @return
     */
    public T get(int n) {
        // 构建返回对象
        Node node = head.next;
        // 找到元素
        for (int i = 0; i < n; i++) {
            node = node.next;
        }
        return (T) node.val;
    }

    /**
     * 链表添加数据
     *
     * @param t
     */
    public void insert(T t) {
        // 找到最后一个元素
        Node n = head;
        while (n.next != null) {
            n = n.next;
        }
        // 创建新节点
        Node<T> newNode = new Node<>(t, null);
        // 最后一个节点指向新节点
        n.next = newNode;
        // 元素个数+1
        len++;
    }

    /**
     * 在线性表的i处添加元素
     *
     * @param n
     * @param t
     */
    public void insert(int n, T t) {
        // 获取到i处前一个元素
        Node prev = head;
        for (int i = 0; i < n; i++) {
            prev = prev.next;
        }
        // 找到n处的元素
        Node current = prev.next;
        // 创建新元素
        Node<T> newNode = new Node<>(t, current);
        // n - 1处元素指向新元素
        prev.next = newNode;
        // 元素数量加一
        len++;
    }

    /**
     * 删除指定位置的元素
     *
     * @param n
     * @return
     */
    public T remove(int n) {
        // 获取指定元素的上一个节点
        Node prev = head;
        for (int i = 0; i < n; i++) {
            prev = prev.next;
        }
        // 获取到n处的节点
        Node current = prev.next;
        // 获取到指定元素的下一个节点
        Node next = current.next;
        // 让 n处的元素上一个节点 指向它的下一个节点
        prev.next = next;
        // 返回结果
        return (T) current.val;
    }

    /**
     * 获取元素首次在链表中出现的位置
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        // 从头节点开始依次遍历
        Node node = head;
        for (int i = 0; node.next != null; i++) {
            node = node.next;
            if (node.equals(t)) {
                return i;
            }
        }
        return -1;
    }

}
