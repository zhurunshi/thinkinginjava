package pers.rush.beginner._46_持有对象_容器类基本概念和打印;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Snow {

}

/**
 * 粉末状的雪
 * @author Administrator
 *
 */
class Powder extends Snow {
    
}

/**
 * 小雪
 * @author Administrator
 *
 */
class Light extends Powder{
    
}

/**
 * 大雪
 * @author Administrator
 *
 */
class Heavy extends Powder{
    
}

/**
 * 暴雪
 * @author Administrator
 *
 */
class Crusty extends Snow {
    
}

/**
 * 雨夹雪
 * @author Administrator
 *
 */
class Slush extends Snow {
    
}

public class AsListInference {
    public static void main(String[] args) {
        // 第一种asList
        List<Snow> snowl = Arrays.asList(new Crusty(), new Slush(), new Powder()); // 暴雪,雨夹雪,粉末状的雪
        // 第二种addAll
        List<Snow> snow2 = new ArrayList<Snow>();
        // 向snow2中添加两个元素
        Collections.addAll(snow2, new Light(), new Heavy());
        // 第三种addAll
        List<Snow> snow3 = new ArrayList<Snow>(snowl);
        Snow[] sa = new Snow[2];
        Collections.addAll(snow3, snow2.toArray(sa));
        // 第四种<T>asList
        List<Snow> snow4 = Arrays.<Snow>asList(new Light(), new Heavy());

        for(Snow s : snowl) {
            System.out.print(s + " ");
        }
        System.out.println();
        for(Snow s : snow2) {
            System.out.print(s + " ");
        }
        System.out.println();
        for(Snow s : snow3) {
            System.out.print(s + " ");
        }
        System.out.println();
        for(Snow s : snow4) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
