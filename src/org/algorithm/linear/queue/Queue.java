package org.algorithm.linear.queue;

/**
 * @Author caopz
 * @Date 2020/8/27
 * @Description: 队列
 */
public class Queue<T> {

    private Node head;

    private Node last;

    private int len;

    public Queue() {
        this.head = new Node(null, null);
        this.last = null;
        this.len = 0;
    }

    /**
     * 判断队列是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return len == 0;
    }

    /**
     * 获取队列的长度
     *
     * @return
     */
    public int size() {
        return len;
    }

    /**
     * 队列插入数据
     *
     * @param t
     */
    public void enqueue(T t) {
        // 当前尾节点为null
        if (last == null) {
            last = new Node(t, null);
            head.next = last;
        } else {
            // 尾节点不为null
            Node oldLast = last;
            last = new Node(t, null);
            oldLast.next = last;
        }
        // 元素个数加一
        len++;
    }

    /**
     * 拿出一个元素
     *
     * @return
     */
    public T dequeue() {
        if (isEmpty()) {
            return null;
        }
        Node oldFirst = head.next;
        head.next = oldFirst.next;

        len --;

        // 判断是否需要重置last
        if (isEmpty()) {
            last = null;
        }

        return (T) oldFirst.val;
    }
}
