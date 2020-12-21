package org.leetcode.simple;

import org.leetcode.simple.pojo.Stack;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author caopz
 * @Date 2020/12/21
 * @Description: 有效的括号 https://leetcode-cn.com/problems/valid-parentheses/description
 */
public class ValidParentheses {

    public static void main(String[] args) {
        System.out.println(isValid("{}"));
    }

    public static boolean isValid(String str) {
        boolean flag = true;
        Stack<String> stack = new Stack<>();
        Map<String, String> mapper = new HashMap<>();
        mapper.put("{", "}");
        mapper.put("[", "]");
        mapper.put("(", ")");
        char[] chars = str.toCharArray();
        for (char c : chars) {
            String val = Character.toString(c);
            if (mapper.containsKey(val)) {
                stack.push(Character.toString(c));
            } else {
                String peak = stack.pop();
                if (!mapper.get(peak).equals(val)) {
                    return false;
                }
            }
        }
        if (stack.size() > 0) {
            return false;
        }

        return flag;
    }

}
