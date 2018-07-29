package pers.rush.beginner._41_内部类_方法和作用域内的内部类及匿名内部类;

public class Parcel3 {
    public Contents contents() {
        /**
         * 匿名内部类
         */
        return new Contents() {
            private int i = 11;
            public int value() {
                return i;
            }
        }; // 注意后面的分号
    }
    
    public static void main(String[] args) {
        Parcel3 p = new Parcel3();
        Contents c = p.contents();
        System.out.println(c.value());
    }
}
