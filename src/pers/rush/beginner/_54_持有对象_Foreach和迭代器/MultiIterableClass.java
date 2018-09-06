package pers.rush.beginner._54_持有对象_Foreach和迭代器;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class MultiIterableClass extends IterableClass {
    public Iterable<String> reversed() {
        return new Iterable<String>() {
            public Iterator<String> iterator() {
                return new Iterator<String>() {
                    int current = words.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }
                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
            }
        };
    }
    
    public Iterable<String> reversedLambda() {
        return () -> {
                return new Iterator<String>() { 
                    // 因为这里有两个方法,所以不能用lambda表达式
                    int current = words.length - 1;
                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }
                    @Override
                    public String next() {
                        return words[current--];
                    }
                };
        };
    }
    
    public Iterable<String> randomized() {
        return new Iterable<String>() {
            @Override
            public Iterator<String> iterator() {
                List<String> shuffled = new ArrayList<>(Arrays.asList(words));
                Collections.shuffle(shuffled, new Random(47));
                return shuffled.iterator();
            }
        };
    }
    
    public Iterable<String> randomizedLambda() {
        return () -> {
            List<String> shuffled = new ArrayList<>(Arrays.asList(words));
            Collections.shuffle(shuffled, new Random(47));
            return shuffled.iterator();
        };
    }
    
    public static void main(String[] args) {
        MultiIterableClass mic = new MultiIterableClass();
        for(String s : mic.reversed()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for(String s : mic.randomized()) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : mic) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

}
