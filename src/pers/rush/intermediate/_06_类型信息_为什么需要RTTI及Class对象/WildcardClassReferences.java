package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

/**
 * 通配符Class引用
 */
public class WildcardClassReferences {
    public static void main(String[] args) {
        Class<?> intClass = int.class; // 用泛型又不限定具体类型
        intClass = double.class;
    }
}
