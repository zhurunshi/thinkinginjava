package pers.rush.intermediate._01_字符串_不可变String和StringBuilder;
public class Concatenation {

    public static void main(String[] args) {
        String mango = "mango";
        /* 最初的时候中间会产生很多没用的String对象
         * 后期改了，默认调用StringBuilder的append方法，用反编译工具可以看出来
         * StringBuilder是可变字符串
         * StringBuilder创建的对象不在字符串池里面,而是在堆里面
         */
        String s = "abc" + mango + "def" + 47;
        System.out.println(s);
    }

}
