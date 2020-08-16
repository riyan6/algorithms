package org.algorithm.test;

import org.algorithm.sequence.sequenceList;

import java.util.Iterator;

/**
 * @Author caopz
 * @Date 2020/8/16
 * @Description:顺序表 测试
 */
public class sequenceListTest {

    public static void main(String[] args) {
        sequenceList<Integer> list = new sequenceList(5);
        list.insert(7);
        list.insert(5);
        list.insert(1);
        list.insert(6);
        list.insert(9);

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
