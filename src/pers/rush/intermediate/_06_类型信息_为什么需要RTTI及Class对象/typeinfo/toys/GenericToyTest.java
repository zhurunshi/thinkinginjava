package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象.typeinfo.toys;

/**
 * 通用玩具测试
 */
public class GenericToyTest {
    public static void main(String[] args) throws Exception {
        Class<FancyToy> ftClass = FancyToy.class;

        FancyToy fancyToy = ftClass.newInstance();
        Class<? super FancyToy> up = ftClass.getSuperclass(); // 指定FancyToy的父类
        Object obj = up.newInstance();

    }
}
