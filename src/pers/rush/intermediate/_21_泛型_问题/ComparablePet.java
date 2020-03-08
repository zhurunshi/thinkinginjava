package pers.rush.intermediate._21_泛型_问题;

/**
 * 可比较的宠物类
 * @author Rush
 * @date 2020/03/08
 */
public class ComparablePet implements Comparable<ComparablePet> {
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}

/**
 * 不可以
 * @author Rush
 * @date 2020/03/08
 */
//class Cat extends ComparablePet implements Comparable<Cat> {
//    @Override
//    public int compareTo(ComparablePet o) {
//        return 0;
//    }
//}

/**
 * 仓鼠
 * @author Rush
 * @date 2020/03/08
 */
class Hamster extends ComparablePet implements Comparable<ComparablePet> {
    // 可以重载
    @Override
    public int compareTo(ComparablePet o) {
         return 0;
    }
}

/**
 * 壁虎
 * @author Rush
 * @date 2020/03/08
 */
class Gecko extends ComparablePet {
    @Override
    public int compareTo(ComparablePet o) {
        return 0;
    }
}








