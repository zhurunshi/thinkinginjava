package pers.rush.beginner._41_内部类_方法和作用域内的内部类及匿名内部类;

public class Parcel4 {
    public Wrapping wrapping(int x) {
        /**
         * 匿名子类
         */
        return new Wrapping(x) {
            // 变量一般用私有的,因为类外部也用不了
            private String name = "sdf";
            // 重写value方法
            public int value() {
                return super.value() * 47;
            }
        };
    }
    
    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        System.out.println(p.wrapping(10).value());
    }
}
