package org.algorithm.test;

import org.algorithm.linear.stack.Stack;

/**
 * @Author caopz
 * @Date 2020/8/23
 * @Description: 栈的测试
 */
public class StackTest {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // 添加元素
        stack.push("a");
        stack.push("b");
        stack.push("c");
        stack.push("d");
        // 输出
        for (String item : stack) {
            System.out.print(item + " ");
        }
        System.out.println("\nlen:" + stack.size());
        System.out.println("------------------------------");
        System.out.print("弹出了：" + stack.pop());
        System.out.println("\nlen:" + stack.size());
        System.out.print("弹出了：" + stack.pop());
        System.out.println("\nlen:" + stack.size());

    }

}
