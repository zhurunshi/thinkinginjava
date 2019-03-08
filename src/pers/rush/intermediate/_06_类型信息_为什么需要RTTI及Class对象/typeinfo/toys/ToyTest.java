package pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象.typeinfo.toys;

/**
 * 带电池的
 */
interface HasBatteries{}

/**
 * 防水的
 */
interface Waterproof{}

/**
 * 能发射的
 */
interface Shoots{}

class Toy {
    Toy() {}
    Toy (int i) {}
}

/**
 * 益智玩具
 */
class FancyToy extends Toy implements  HasBatteries, Waterproof, Shoots {
    FancyToy() {
        super(1);
    }
}

public class ToyTest {
    static void printInfo(Class cc) {
        System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
        System.out.println("Simple name: " + cc.getSimpleName()); // 不包含包名的Class名称
        System.out.println("Canonical name : " + cc.getCanonicalName()); //规范名称
    }

    public static void main(String[] args) {
        Class c = null;
        try {
            c = Class.forName("pers.rush.intermediate._06_类型信息_为什么需要RTTI及Class对象.typeinfo.toys.FancyToy");
        } catch (ClassNotFoundException e) {
            System.out.println("Can't find FancyToy");
            System.exit(1);
        }
        printInfo(c);
        for (Class face : c.getInterfaces()) {
            printInfo(face);
        }
        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            System.out.println("Cannot instantiate");
            System.exit(1);
        } catch (IllegalAccessException e) {
            System.out.println("Cannot access");
            System.exit(1);
        }
        printInfo(obj.getClass());
    }
}
