package pers.rush.beginner._54_持有对象_Foreach和迭代器;

import java.util.Iterator;

public class IterableClass implements Iterable<String>{
    protected String[] words = ("And that is now we know the Earth to be banana-shaped").split(" ");

    @Override
    public Iterator<String> iterator() { // 能返回迭代器的方法
        return new Iterator<String>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < words.length;
            }
            @Override
            public String next() {
                return words[index++];
            }
        };
    }
    
    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.print(s + "  ");
        }
    }


}
