package org.algorithm.tree;

/**
 * @Author caopz
 * @Date 2020/9/16
 * @Description: 二叉树
 */
public class BinaryTree<Key extends Comparable<Key>, Value> {

    /**
     * 根节点
     */
    private Node root;

    /**
     * 数中元素个数
     */
    private int len;

    private class Node {
        // 存储键
        public Key key;
        // 储存值
        private Value value;
        // 储存左键
        private Node left;
        // 存储右键
        private Node right;

        public Node(Key key, Value value, Node left, Node right) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public int length() {
        return len;
    }

    /**
     * 树中添加元素键值对
     *
     * @param key
     * @param value
     */
    public void put(Key key, Value value) {
        root = put(root, key, value);
    }

    public Node put(Node x, Key key, Value value) {
        // 如果x 为空
        if (x == null) {
            len++;
            return new Node(key, value, null, null);
        }
        // 如果x不为空
        // 如果key大于x的键，则继续找x的右子
        if (key.compareTo(x.key) > 0) {
            x.right = put(x.right, key, value);
        } else
            // 如果key小于x的键，则继续找x的左子
            if (key.compareTo(x.key) < 0) {
                x.left = put(x.left, key, value);
            } else
                // 如果key等于x的键，则替换x的值为value
                if (key.compareTo(x.key) == 0) {
                    x.value = value;
                }
        return x;
    }

}
