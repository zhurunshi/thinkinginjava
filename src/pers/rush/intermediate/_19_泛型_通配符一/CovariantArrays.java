 package pers.rush.intermediate._19_泛型_通配符一;

class Fruit {}
 
class Apple extends Fruit {}

/**
 * 晚秋的一种红皮苹果
 * @author Rush
 * @date 2020/02/03
 */
class Jonathan extends Apple {}
 
class Orange extends Fruit{}

public class CovariantArrays {
    public static void main(String[] args) {
        Fruit[] fruit = new Apple[10];
        fruit[0] = new Apple();
        fruit[1] = new Jonathan();
        
        // 下面没报错的原因是,因为数组是由Fruit声明的
        // 但是实际运行的时候,会报错
        try {
            fruit[0] = new Fruit();
        } catch(Exception e) {
            System.out.println(e);
        }
        try {
            fruit[0] = new Orange();
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
