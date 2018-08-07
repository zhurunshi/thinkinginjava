package pers.rush.beginner._44_内部类_内部类的继承和局部内部类;

class Egg2 {
    private Yolk y = new Yolk();

    /**
     * 蛋黄
     * 
     * @author Rush
     *
     */
    protected class Yolk {
        public Yolk() {
            System.out.println("Egg2.Yolk()");
        }

        public void f() {
            System.out.println("Egg2.Yolk.f()");
        }
    }

    public Egg2() {
        System.out.println("New Egg2()");
    }

    public void insertYolk(Yolk yy) {
        y = yy;
    }

    public void g() {
        y.f();
    }
}

public class BigEgg2 extends Egg2 {
    public class Yolk extends Egg2.Yolk {
        public Yolk() {
            System.out.println("BigEgg2.Yolk()");
        }

        public void f() {
            System.out.println("BigEgg2.Yolk.f()");
        }
    }

    public BigEgg2() {
        insertYolk(new Yolk());
    }
}
