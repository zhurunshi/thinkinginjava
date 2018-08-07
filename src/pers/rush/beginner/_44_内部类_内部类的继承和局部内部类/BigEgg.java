package pers.rush.beginner._44_内部类_内部类的继承和局部内部类;

// 内部类是否能被覆盖?

class Egg {
    private Yolk y;
    /**
     * 蛋黄
     * @author Rush
     *
     */
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg.Yolk()");
        }
    }
    public Egg() {
        System.out.println("New Egg()");
        y = new Yolk();
    }
}

public class BigEgg extends Egg {
    public class Yolk {
        public Yolk() {
            System.out.println("BigEgg.Yolk()");
        }
    }
    
    public static void main(String[] args) {
        new BigEgg();
        /*
         * 执行的是父类的Yolk:Egg.Yolk()
         * 继承时内部类是不能被覆盖的
         * 虽然外围类存在继承关系:BigEgg extends Egg
         * 但是内部类没有发生变化
         * 两个内部类是完全独立的两个实体
         * 各自在自己的命名空间里
         */
    }
}
