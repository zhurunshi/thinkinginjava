package pers.rush.beginner;

import java.util.Arrays;
import java.util.Random;

class Other {
    public static void main(String[] args) {
        for (String s : args) {
            System.out.print(s + " ");
        }
        System.out.println();
    }
}
//-----------------
class VarArgs {
    static void printArray(Object[] args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
//--------可变参数---------
class UnknownParaNum {
    static void printArray(Object... args) {
        for (Object object : args) {
            System.out.print(object + " ");
        }
        System.out.println();
    }
}
//-----------------
class OptionTrailingArguments {
    static void f(int required, String... strings) {
        System.out.print("required: " + required + " ");
        for (String string : strings) {
            System.out.print(string + " ");
        }
        System.out.println();
    }
}
//-----------------
class VarargType {
    static void f(Character... characters) {
        System.out.print(characters.getClass());
        System.out.println(" length " + characters.length);
    }
    static void g(int... ints) {
        System.out.print(ints.getClass());
        System.out.println(" length " + ints.length);
    }
}
public class _21_数组初始化 {

    public static void main(String[] args) {
        // 方式一:
        int[] a1 = new int[10];
        a1[0] = 10;
        // 方式二:
        int[] a2 = {0, 1, 2, 3, 4};
        int[] a;
        Random rand = new Random(47); // 种子
        a = new int[rand.nextInt(20)];
        System.out.println(a.length);
        for (int i = 0; i < a.length; ++i) {
            a[i] = rand.nextInt(500);
        }
        System.out.println(Arrays.toString(a));
        
        Integer[] aInteger = {new Integer(1), new Integer(2), 3};
        Integer[] bInteger = new Integer[] {new Integer(1), new Integer(2), 3};
        System.out.println(Arrays.toString(aInteger));
        System.out.println(Arrays.toString(bInteger));
        
        System.out.println("--------------------------------------------");
        
        Other.main(new String[] {"1111", "2222", "3333"});
        
        System.out.println("--------------------------------------------");
        VarArgs.printArray(new Object[] {new Integer(4), new Float(3.14), new Double(11.11)});
        
        System.out.println("--------------------------------------------");
        UnknownParaNum.printArray(47, 3.14f, 11.11);
        UnknownParaNum.printArray("One", "Two", "Three");
        UnknownParaNum.printArray((Object[])new Integer[] {1, 2, 3, 4});
        UnknownParaNum.printArray();
        System.out.println("--------------------------------------------");
        OptionTrailingArguments.f(1, "one");
        OptionTrailingArguments.f(3, "one", "two", "three");
        OptionTrailingArguments.f(0);
        System.out.println("--------------------------------------------");
        VarargType.f('a');
        VarargType.f();
        VarargType.g(1);
        VarargType.g();
    }

}
