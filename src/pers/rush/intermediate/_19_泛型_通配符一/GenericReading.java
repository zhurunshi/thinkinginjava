 package pers.rush.intermediate._19_泛型_通配符一;

import java.util.Arrays;
import java.util.List;

public class GenericReading {
     /**
      * 读取什么都行
      * @param list
      * @return
      */
     static <T> T readExact(List<T> list) {
         return list.get(0);
     }
     static List<Apple> apples = Arrays.asList(new Apple());
     static List<Fruit> fruits = Arrays.asList(new Fruit());
     static void f1() {
         Apple a = readExact(apples);
         Fruit f = readExact(fruits);
         f = readExact(apples);
     }
     
     /**
      * 静态内部类
      * @author Rush
      * @date 2020/02/06
      */
     static class Reader<T> {
         T readExact(List<T> list) {
             return list.get(0);
         } 
     }
     
     static void f2() {
         // 创建时就指定了读取的类型
         Reader<Fruit> fruitReader = new Reader<Fruit>();
         Fruit f = fruitReader.readExact(fruits);
     }
     
     /**
      * 协变读取类
      * @author Rush
      * @date 2020/02/06
      */
     static class CovariantReader<T> {
         T readCovariant(List<? extends T> list) {
             return list.get(0);
         }
     }
     static void f3() {
         CovariantReader<Fruit> fruitReader = new CovariantReader<Fruit>();
         Fruit f = fruitReader.readCovariant(fruits);
         Fruit a = fruitReader.readCovariant(apples);
     }
     
     public static void main(String[] args) {
        f1();
        f2(); 
        f3();
    }
}
