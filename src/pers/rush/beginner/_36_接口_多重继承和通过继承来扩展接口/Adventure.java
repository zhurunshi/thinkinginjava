package pers.rush.beginner._36_接口_多重继承和通过继承来扩展接口;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly{
    void fly();
}

class ActionCharacter{
    public void fight(){
        
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly{

    // 少一个方法,因为继承的ActionCharacter里面有了fight方法
    
    @Override
    public void fly() {
        
    }

    @Override
    public void swim() {
        
    }
    
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void u(CanSwim x) {
        x.swim();
    }
    public static void v(CanFly x) {
        x.fly();
    }
    public static void w(ActionCharacter x) {
        x.fight();
    }
    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        u(h);
        v(h);
        w(h);
        /*
         * 实现接口的目的,可以把对象向上转型,使用接口的方法 
         * 通常的情况下,向上转型时应该使用接口还是抽象类呢?
         * 如果要创建的是不带任何方法定义和成员变量的基类,选择接口
         * 因为这种情况下,使用接口的话扩展更灵活
         */
        /*
         * 接口和接口之间也是可以继承的
         */
    }
}
