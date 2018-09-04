package pers.rush.beginner._49_持有对象_LinkedList和Stack;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListFeatures {
    /*
     * LinkedList 底层数据结构用的是链表。可以当做栈，队列，双端队列使用。
     * ArrayList 用的是数组
     */
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>(8);
        for(int i = 0; i < 8; ++i) {
            al.add(i + "");
        }
        LinkedList<String> ll = new LinkedList<>(al);
        System.out.println(ll);
        // 获取第一个
        System.out.println("LinkedList.getFirst(): " + ll.getFirst());
        System.out.println("LinkedList.element(): " + ll.element());
        System.out.println("LinkedList.peek(): " + ll.peek()); // 栈，获取第一个，但不删除
        // 删除第一个
        System.out.println("LinkedList.remove(): " + ll.remove());
        System.out.println("LinkedList.removeFirst(): " + ll.removeFirst());
        System.out.println("LinkedList.poll(): " + ll.poll()); // 栈的弹出
        System.out.println(ll);
        // 添加
        ll.addFirst("addFirst");
        System.out.println("After addFirst(): " + ll);
        ll.offer("offer");
        System.out.println("After offer(): " + ll);
        ll.add("add");
        System.out.println("After add(): " + ll);
        ll.addLast("addLast");
        System.out.println("After addLast(): " + ll);
        // 删除
        System.out.println("After removeLast(): " + ll.removeLast());
        System.out.println(ll);
    }
}
