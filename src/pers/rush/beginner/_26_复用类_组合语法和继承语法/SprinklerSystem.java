package pers.rush.beginner._26_复用类_组合语法和继承语法;

/**
 * 喷水器
 * @author Rush
 *
 */
public class SprinklerSystem {
    // 组合
    private String val1, val2, val3, val4;
    private WaterSource src = new WaterSource();
    private int i;
    private float f;
    public String toString() {
        return "val1=" + val1 + " val2=" + val2
                + " val3=" + val3 + " val4=" + val4
                + " i=" + i + " f=" + f + " src=" + src;
    }
    
    public static void main(String[] args) {
        SprinklerSystem sprinklers = new SprinklerSystem();
        System.out.println(sprinklers);
        
        /* 
         * 初始化顺序:
         * 1.在定义时初始化 private WaterSource src = new WaterSource();
         * 2.构造器内初始化
         * 3.用的时候检测是不是null,如果不是null,再初始化(耗资源大)
         * 4.使用实例初始化,在方法的外面,类的里面,使用{}包裹
         */
    }
}

/**
 * 水源
 * @author Rush
 *
 */
class WaterSource {
    private String s;
    WaterSource() {
        System.out.println("WaterSource()");
        s = "Constructed";
    }
    public String toString() {
        return s;
    }
}
