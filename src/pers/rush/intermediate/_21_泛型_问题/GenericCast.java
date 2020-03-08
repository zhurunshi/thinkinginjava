package pers.rush.intermediate._21_泛型_问题;

class FixedSizeStack<T> {
    private int index = 0;
    private Object[] storage;
    public FixedSizeStack(int size ) {
        storage = new Object[size];
    }
    public void push(T item) {
        storage[index++] = item;
    }
    public T pop() {
        return (T) storage[--index];
    }
}

/**
 * 泛型转型
 * @author Rush
 * @date 2020/03/08
 */
public class GenericCast {
    public static final int SIZE = 10;
    public static void main(String[] args) {
        FixedSizeStack<String> strings = new FixedSizeStack<String>(10);
        for(String s : "A B C D E F G H I J".split(" ")){
            strings.push(s);
        }
        for(int i = 0; i < SIZE; ++i) {
            String s = strings.pop();
            System.out.print(s + "  ");
        }
            
    }
}
