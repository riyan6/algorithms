package org.leetcode.simple.pojo;

import java.util.Arrays;

/**
 * @Author caopz
 * @Date 2020/12/21
 * @Description: 栈
 */
public class Stack<T> {

    /**
     * 栈的总容量
     */
    private int capacity;

    /**
     * 存储栈内元素的数组
     */
    private T[] storage;

    /**
     * 栈的当前容量
     */
    private int count;

    /**
     * 扩容因子
     */
    private final int grow_factor = 2;

    /**
     * 有参构造方法
     *
     * @param initCapacity
     */
    public Stack(int initCapacity) {
        if (initCapacity < 1) {
            throw new IllegalArgumentException("initCapacity is too small");
        }
        this.capacity = initCapacity;
        this.storage = (T[]) new Object[initCapacity];
        this.count = 0;
    }

    public Stack() {
        this.capacity = 8;
        this.storage = (T[]) new Object[8];
        this.count = 0;
    }

    /**
     * 入栈
     */
    public void push(T value) {
        if (count == capacity) {
            ensureCapacity();
        }
        storage[count++] = value;
    }

    /**
     * 弹出并返回栈顶元素
     */
    public T pop() {
        count--;
        if (count == -1) {
            throw new IllegalArgumentException("empty stack!");
        }
        return storage[count];
    }

    /**
     * 只返回栈顶元素
     */
    public T peek() {
        if (count == 0) {
            throw new IllegalArgumentException("empty stack");
        }
        return storage[count - 1];
    }

    /**
     * 判空
     */
    public boolean isEmpty() {
        return count == 0;
    }

    /**
     * 获取当前栈容量
     */
    public int size() {
        return count;
    }

    /**
     * 扩容机制
     */
    private void ensureCapacity() {
        int newCapacity = capacity * grow_factor;
        storage = Arrays.copyOf(storage, newCapacity);
        capacity = newCapacity;
    }

}
