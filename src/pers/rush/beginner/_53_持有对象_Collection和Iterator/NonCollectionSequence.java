package pers.rush.beginner._53_持有对象_Collection和Iterator;

import java.util.Iterator;

class StringSequence {
    protected String[] strings = "1 2 3 4 5 6 7 8".split(" ");
}

public class NonCollectionSequence extends StringSequence {
    // 已经继承了，怎么调用Collection方法
    // 自己包装迭代器
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < strings.length;
            }

            @Override
            public String next() {
                return strings[index++];
            }
            
        };
    }
    
    public static void main(String[] args) {
        NonCollectionSequence ncs = new NonCollectionSequence();
        InterfaceVsIterator.display(ncs.iterator());
    }

}
