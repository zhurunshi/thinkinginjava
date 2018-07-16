package pers.rush.beginner._37_接口_适配接口与接口中的域;

import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Random;
import java.util.Scanner;

public class RandomWords implements Readable {

    private static Random rand = new Random(47);
    private static final char[] capitals = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] lowers = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    // 元音数组
    private static final char[] vowels = "aeiou".toCharArray();
    private int count; // 可读的次数
    
    public RandomWords(int count) {
        this.count = count;
    }
    
    /**
     * 返回字符的长度,没有任何输入信息,返回-1
     */
    @Override
    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(capitals[rand.nextInt(capitals.length)]);
        for(int i = 0; i < 4; ++i) {
            cb.append(lowers[rand.nextInt(lowers.length)]);
            cb.append(vowels[rand.nextInt(vowels.length)]);
        }
        cb.append(" ");
        return 10;
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(new RandomWords(10));
        while(s.hasNext()) { // 返回true or false 调用read方法
            System.out.println(s.next());
        }
    }

}
