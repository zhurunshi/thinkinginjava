package pers.rush.beginner._45_持有对象_泛型和类型安全的容器;

import java.util.ArrayList;

class Apple {
    private static long counter;
    private final long id = counter++;
    public long id() {
        return id;
    }
}

class Orange {
    
}

/**
 * 苹果和橘子没有泛型
 * @author Administrator
 *
 */
public class ApplesAndOrangesWithoutGenerics {
    public static void main(String[] args) {
        ArrayList apples = new ArrayList();
        for (int i = 0; i < 3; ++i) {
            apples.add(new Apple());
        }
        apples.add(new Orange());
        for (int i = 0; i < apples.size(); ++i) {
            System.out.println(((Apple) apples.get(i)).id());
        }
        // 编译通过，运行时出错
    }
}
