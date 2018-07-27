package pers.rush.beginner._39_内部类_创建内部类及链接到外部类;

interface Selector {
    boolean end();
    Object current();
    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;
    public Sequence(int size) {
        items = new Object[size];
    }
    public void add(Object x) {
        if(next < items.length) {
            items[next++] = x;
        }
//        System.out.println("next=" + next);
    }
    private class SequenceSelector implements Selector {
        private int i = 0;
        @Override
        public boolean end() {
            // items是外围成员,在内部类直接操作外围属性成员
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                ++i;
            }
        }
        
    }
    
    public Selector selector() {
        return new SequenceSelector();
    }
    
    public static void main(String[] args) {
        Sequence seq = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            seq.add(i);
        }
        Selector selector = seq.selector();
        while(!selector.end()) {
            System.out.println(selector.current());
            selector.next();
        }
        /*
         * 具体实现方式是当某个外围类创建内部类对象后,
         * 内部类对象会秘密捕获一个指向外围类对象的引用.
         * 由编译器完成
         */
    }
}
