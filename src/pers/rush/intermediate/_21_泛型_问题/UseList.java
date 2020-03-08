package pers.rush.intermediate._21_泛型_问题;

import java.util.List;

public class UseList<W,T> {
    // 因为泛型把类型信息擦除了,所以看起来一模一样,所以编译会出错
//    void f(List<T> v) {}
//    void f(List<W> v) {}
    void f1(List<T> v) {}
    void f2(List<W> v) {}
    // List<T> 和 List<W> 实际擦除后是一样的
}
