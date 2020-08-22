package org.algorithm.linear.single;

/**
 * @Author caopz
 * @Date 2020/8/22
 * @Description: 链表、
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
     * @param i
     * @param t
     */
    public void insert(int i, T t) {
        // 7 5 1 6 9 2 -> 7 5 1 0 6 9 2 从第四个处开始插入 0
        // 获取到i处前一个元素
        Node node = head;
        // 创建新元素

        // i - 1处元素指向新元素

        // 新元素指向原来i处后的元素

    }

}
