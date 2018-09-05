package pers.rush.beginner._52_持有对象_Queue;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueueDemo {

    public static void main(String[] args) {
        /*
         * 优先级队列 可排序:倒序正序
         */
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        // 整数直接可以排序,从小到大
        Random rand = new Random(47);
        for (int i = 0; i < 10; ++i) {
            priorityQueue.offer(rand.nextInt(i + 10));
        }
        QueueDemo.printQ(priorityQueue);
        // 可以直接给一个集合
        List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
        priorityQueue = new PriorityQueue<>(ints);
        QueueDemo.printQ(priorityQueue);
        // 倒序,在创建优先队列时指定方向
        priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        priorityQueue.addAll(ints);
        QueueDemo.printQ(priorityQueue);
        // 字符 按照ASCII码排序
        String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
        List<String> strings = Arrays.asList(fact.split("")); // 空字符串,切分使每一个元素都是一个字符
        PriorityQueue<String> stringPQ = new PriorityQueue<>(strings);
        QueueDemo.printQ(stringPQ); // 前面空白是空格
        // 字符串也可以从大到小 根据ASCII码
        stringPQ = new PriorityQueue<>(strings.size(), Collections.reverseOrder());
        stringPQ.addAll(strings);
        QueueDemo.printQ(stringPQ);
        // 要求既不重复又能排序:先放Set再放优先级队列中
        Set<Character> charSet = new HashSet<>();
        for(Character c : fact.toCharArray()) {
            charSet.add(c); // 去重
        }
        PriorityQueue<Character> characterPQ = new PriorityQueue<>(charSet);
        QueueDemo.printQ(characterPQ);
    }

}
