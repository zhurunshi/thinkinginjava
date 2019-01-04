package pers.rush.intermediate._02_字符串_无意识递归及格式化输出;

import java.util.ArrayList;
import java.util.List;

public class InfiniteRecursion {

    public String toString() {
//        return "InfiniteRecursion address" + this + "\n"; // this代表实例自身对象,会无限递归
        return "InfiniteRecursion address" + super.toString() + "\n"; // 如果想要打印对象的内存地址
    }
    
    public static void main(String[] args) {
        List<InfiniteRecursion> v = new ArrayList<>();
        for (int i = 0; i < 10; ++i) {
            v.add(new InfiniteRecursion());
        }
        System.out.println(v);
    }

}
