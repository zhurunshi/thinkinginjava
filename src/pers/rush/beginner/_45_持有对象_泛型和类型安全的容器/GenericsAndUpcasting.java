package pers.rush.beginner._45_持有对象_泛型和类型安全的容器;

import java.util.ArrayList;

/**
 * 澳洲青苹
 * @author Rush
 *
 */
class GrannySmith extends Apple {
    
}

class Gala extends Apple {
    
}

/**
 * 富士
 * @author Administrator
 *
 */
class Fuji extends Apple {
    
}

/**
 * 呼伦贝尔
 * @author Administrator
 *
 */
class Bracburn extends Apple {
    
}

public class GenericsAndUpcasting {
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<Apple>();
        // 支持向上转型
        apples.add(new GrannySmith());
        apples.add(new Gala());
        apples.add(new Fuji());
        apples.add(new Bracburn());
        
        for (Apple a : apples) {
            System.out.println(a.id());
        }
;    }
}
