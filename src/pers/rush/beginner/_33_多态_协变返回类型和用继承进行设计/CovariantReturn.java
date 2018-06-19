package pers.rush.beginner._33_多态_协变返回类型和用继承进行设计;

/**
 * 粮食
 * @author Rush
 */
class Grain{
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    public String toString() {
        return "Wheat";
    }
}

/**
 * 磨坊
 * @author Rush
 *
 */
class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    /*
     * 也属于覆盖父类方法
     * 协变返回类型
     * 1.5之前不允许,1.5之后允许
     * 算覆盖方法,然后返回值是父类型返回值的子类
     */
    @Override
    Wheat process() {
        return new Wheat();
    }
}

/**
 * @author Rush
 * 协变返回
 */
public class CovariantReturn {
    public static void main(String[] args) {
        Mill m = new Mill();
        Grain g = m.process();
        System.out.println(g);
        m = new WheatMill();
        System.out.println(m.process());
        /*
         * 首先使用组合
         * 组合使用起来更灵活
         * 可以动态选择类型
         */
    }
}
