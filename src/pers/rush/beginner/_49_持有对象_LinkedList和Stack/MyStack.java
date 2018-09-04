package pers.rush.beginner._49_持有对象_LinkedList和Stack;

import java.util.LinkedList;

/*
 * Stack 栈，线性数据结构
 * 特点：先进后出。FILO
 * 叠加栈。
 */

/**
 * 泛型栈
 * @author Rush
 */
public class MyStack<T> {
    private LinkedList<T> storage = new LinkedList<T>();
    /**
     * 压栈
     * @param v
     * @author Rush
     */
    public void push(T v) {
        storage.addFirst(v);
    }
    /**
     * 查看
     * @return
     * @author Rush
     */
    public T peek() {
        return storage.getFirst();
    }
    /**
     * 弹出
     * @return
     * @author Rush
     */
    public T pop() {
        return storage.removeFirst();
    }
    /**
     * 判空
     * @return
     * @author Rush
     */
    public boolean empty() {
        return storage.isEmpty();
    }
    @Override
    public String toString() {
        return storage.toString();
    }
}
