package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

/**
 * 通用Class引用
 */
public class GenericClassReferences {
    public static void main(String[] args) {
        Class intClass = int.class;
        Class<Integer> genericIntCLass = int.class; // 指定存某一种类型的对象
        genericIntCLass = Integer.class;
        intClass = double.class; // 无泛型
        // genericIntCLass = double.class; // 编译器直接报错
    }
}
