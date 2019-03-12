package pers.rush.intermediate._08_类型信息_反射;

import com.sun.tools.internal.jxc.ap.Const;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods {
    // 去掉.
    private static Pattern p = Pattern.compile("\\w+\\.");

    public static void main(String[] args) {
        try {
            Class<?> c = Class.forName("pers.rush.intermediate._08_类型信息_反射.ShowMethods");
            Method[] methods = c.getMethods();
            Constructor[] ctors = c.getConstructors();
            for (Method method : methods) {
                System.out.println(method.toString());
            }
            for (Constructor ctor : ctors) {
                System.out.println(ctor.toString());
            }
        } catch (ClassNotFoundException e) {
            System.out.println("No such Class: " + e);
        }
    }


}
