 package pers.rush.intermediate._19_泛型_通配符一;

 public class Holder<T> {
     private T value;
     public Holder() {}
     public Holder(T value) {
         this.value = value;
     }
     public void setValue(T value) {
        this.value = value;
     }
     public T getValue() {
        return value;
     }
     @Override
    public boolean equals(Object obj) {
         return value.equals(obj);
    }
     public static void main(String[] args) {
         Holder<Apple> apples = new Holder<Apple>(new Apple());
         Apple d = apples.getValue();
         apples.setValue(d);
         Holder<? extends Fruit> fruits = apples;
         Fruit p = fruits.getValue();
         d = (Apple) fruits.getValue();
         try {
             Orange c = (Orange) fruits.getValue();
         } catch(Exception e) {
             System.out.println(e);
         }
         System.out.println(fruits.equals(d));
     }
}
