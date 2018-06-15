package pers.rush.beginner._32_多态_构造器与多态;

class Bread{
    Bread(){
        System.out.println("Bread()");
    }
}

class Cheese{
    Cheese(){
        System.out.println("Cheese()");
    }
}

/**
 * 生菜
 * @author Rush
 *
 */
class Lettuce{ 
    Lettuce(){
        System.out.println("Lettuce()");
    }
}

class Meal{
    Meal(){
        System.out.println("Meal()");
    }
}

class Lunch extends Meal{
    Lunch(){
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch{
    PortableLunch(){
        System.out.println("PortableLunch()");
    }
}

public class Sandwich extends PortableLunch{
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();
    public Sandwich() {
        System.out.println("Sandwich()");
    }
   
    public static void main(String[] args) {
        new Sandwich();
    }
}
