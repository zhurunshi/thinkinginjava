package pers.rush.intermediate._02_字符串_无意识递归及格式化输出;

import java.math.BigInteger;
import java.util.Formatter;

public class Conversion {
    /**
     * d 整数
     * c Unicode
     * b boolean
     * s string
     * f 浮点数 十进制
     * e 浮点数 科学计数法
     * x 整数 十六进制
     * h 散列码 十六进制
     * %% 字符%
     */

    public static void main(String[] args) {
        Formatter f = new Formatter(System.out);
        char u = 'a';
        System.out.println("u = 'a'");
        f.format("s: %s\n", u);
        f.format("c: %c\n", u);
        f.format("b: %b\n", u);
        f.format("h: %h\n", u);


        int v = 121;
        System.out.println("v = 121");
        f.format("d: %d\n", v);
        f.format("c: %c\n", v);
        f.format("b: %b\n", v);
        f.format("s: %s\n", v);
        f.format("x: %x\n", v);
        f.format("h: %h\n", v);

        BigInteger bi = new BigInteger("50000000000000");
        System.out.println("bi = new BigInteger(\"50000000000000\")");
        f.format("d: %d\n", bi);
        f.format("s: %s\n", bi);
        f.format("x: %x\n", bi);
        f.format("h: %h\n", bi);

        double d = 179.543;
        System.out.println("x = 179.543");
        f.format("b: %b\n", d);
        f.format("s: %s\n", d);
        f.format("f: %f\n", d);
        f.format("e: %e\n", d);
        f.format("h: %h\n", d);

        Conversion c = new Conversion();
        System.out.println("y = new Conversion()");

        f.format("s: %s\n", c);

        boolean b = false;
        System.out.println("z = false");
        f.format("b: %b\n", b);
        f.format("s: %s\n", b);
        f.format("h: %h\n", b);
    }
}
