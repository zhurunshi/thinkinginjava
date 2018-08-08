package pers.rush.beginner._44_内部类_内部类的继承和局部内部类;

class Egg2 {
    private Yolk y = new Yolk(); // 1 执行初始化,又是内部类跳2

    /**
     * 蛋黄
     * 
     * @author Rush
     *
     */
    protected class Yolk {
        public Yolk() { // 2 执行构造器 // 6
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    public Egg2() { // 3 父类实例成员创建完之后调用父类的构造器
        System.out.println("New Egg2()");
    }

    public void insertYolk(Yolk yy) {
        y = yy; // 8 方法执行
    }

    public void g() {
        y.f(); // 9 方法调用 此时的y是yy即BigEgg2的实例
    }
}

public class BigEgg2 extends Egg2 {
    // 父类继承父类,子类继承子类
    public class Yolk extends Egg2.Yolk { // 5 调用该类的构造方法之前,调用父类的Yolk
        public Yolk() {
            System.out.println("BigEgg2.Yolk()"); // 7 父类构造器调用完后调用子类的
        }

        public void f() {
            System.out.println("BigEgg2.Yolk.f()"); // 10 输出完成
        }
    }

    public BigEgg2() { // 4 调用自己的Yolk
        insertYolk(new Yolk());
    }
    
    public static void main(String[] args) {
        Egg2 e2 = new BigEgg2();
        e2.g();
    }
}
