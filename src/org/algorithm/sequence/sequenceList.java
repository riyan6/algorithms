package org.algorithm.sequence;

import java.util.Iterator;

/**
 * @Author caopz
 * @Date 2020/8/16
 * @Description: 顺序表
 */
public class sequenceList<T> implements Iterable<T> {

    private T[] list;

    private int len;

    public sequenceList(int len) {
        list = (T[]) new Object[len];
        this.len = 0;
    }

    /**
     * 清楚数据
     */
    public void clear() {
        this.len = 0;
    }

    /**
     * 是否为空
     *
     * @return
     */
    public boolean isEmpty() {
        return this.len == 0;
    }

    /**
     * 获取长度
     *
     * @return
     */
    public int length() {
        return this.len;
    }

    /**
     * 根据索引获取元素
     *
     * @param i
     * @return
     */
    public T get(int i) {
        return this.list[i];
    }

    /**
     * 添加元素
     *
     * @param t
     */
    public void insert(T t) {
        // 校验数组长度
        if (this.len == this.list.length) {
            reSize(2 * this.list.length);
        }
        this.list[this.len++] = t;
    }

    /**
     * 从索引处添加元素
     *
     * @param t
     * @param n
     */
    public void insert(T t, int n) {
        // 校验数组长度
        if (this.len == this.list.length) {
            reSize(2 * this.list.length);
        }
        for (int index = this.len - 1; index > n; index--) {
            this.list[index] = this.list[index - 1];
        }
        this.list[n] = t;
        // 增加元素个数
        this.len++;
    }

    /**
     * 删除元素
     *
     * @param n
     * @return
     */
    public T remove(int n) {
        T result = this.list[n];
        // 索引i后面的元素依次向前移动一位
        for (int index = n; index < this.len - 1; index++) {
            this.list[index] = this.list[index + 1];
        }
        // 去除一个长度
        this.len--;
        // 检验长度
        if (this.len < this.list.length / 4) {
            reSize(this.list.length / 2);
        }
        return result;
    }

    /**
     * 找到元素在表中的下标
     *
     * @param t
     * @return
     */
    public int indexOf(T t) {
        for (int i = 0; i < this.list.length; i++) {
            if (this.list[i].equals(t)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * 扩展数组长度
     *
     * @param size
     */
    public void reSize(int size) {
        // 获取到原始的数据
        T[] temp = this.list;
        // 扩容数据
        this.list = (T[]) new Object[size];
        // 转移原来的的数据
        for (int i = 0; i < this.len; i++) {
            this.list[i] = temp[i];
        }
    }


    @Override
    public Iterator<T> iterator() {
        return new SIterable();
    }


    /**
     * 匿名内部类
     */
    private class SIterable implements Iterator {

        /**
         * 下标
         */
        private int cursor;

        private SIterable() {
            // 从第一个元素开始遍历
            this.cursor = 0;
        }

        @Override
        public boolean hasNext() {
            // 如果小于长度说明还有元素
            return cursor < len;
        }

        @Override
        public Object next() {
            return list[cursor++];
        }

    }

}
