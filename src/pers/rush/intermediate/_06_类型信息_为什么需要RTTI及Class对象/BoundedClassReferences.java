package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象;

/**
 * 受限制的Class引用
 */
public class BoundedClassReferences {
    public static void main(String[] args) {
        // 所有的数字都属于Number下的具体类型
        Class<? extends Number> bounded = int.class; // 受限存放
        bounded = double.class;
        bounded = Number.class;

        // bounded = BoundedClassReferences.class; // 不行
    }
}
