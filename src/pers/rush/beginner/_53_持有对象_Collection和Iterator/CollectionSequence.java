package pers.rush.beginner._53_持有对象_Collection和Iterator;

import java.util.AbstractCollection;
import java.util.Iterator;

public class CollectionSequence extends AbstractCollection {

    private String[] strings = "1 2 3 4 5 6 7 8".split(" ");

    @Override
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
            
            @Override
            public void remove() {
                throw new UnsupportedOperationException();
            }
            
        };
    }

    @Override
    public int size() {
        return strings.length;
    }

    public static void main(String[] args) {
        CollectionSequence cs = new CollectionSequence();
        InterfaceVsIterator.display(cs.iterator());
        for (Object object : cs) {
            System.out.println(object);
        }
        /*
         * 已经写好的一个类，想实现集合操作
         * 又不能多继承，怎么办？
         */
    }
}
