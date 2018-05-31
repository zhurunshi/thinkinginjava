package pers.rush.beginner._22_枚举类型;

enum CoffeeBeanSize {
    BIG, HUGE, OVERWHELMING
}

class CoffeeBean {
    CoffeeBeanSize size;
}

class CoffeeBean2 {
    enum CoffeeBeanSize2 {
        大的, 很大的, 超大的
    }
    CoffeeBeanSize2 size;
}

public class CoffeeBeanTest {

    public static void main(String[] args) {
        CoffeeBean drink = new CoffeeBean();
        drink.size = CoffeeBeanSize.HUGE;
        
        CoffeeBean2 drink2 = new CoffeeBean2();
        // 调用的时候用类名调用
        drink2.size = CoffeeBean2.CoffeeBeanSize2.大的;
        
    }

}
