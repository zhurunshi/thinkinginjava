/**
 * 
 */
package pers.rush.beginner._29_复用类_初始化及类的加载;


class Insect{
    private int i = 9;
    protected int j;
    public Insect() {
        System.out.println("i=" + i + ", j=" + j);
        j = 39;
    }
    private static int x1 = printInit("static Insect.x1初始化");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

/**
 * 甲壳虫
 * @author Rush
 *
 */
public class Beetle extends Insect{
    private int k = printInit("Beetle.k初始化");
    public Beetle() {
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }
    private static int x2 = printInit("static Beetle.x2 初始化");
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("Beetle构造器");
        Beetle b = new Beetle();
        /* 
         * 运行顺序:
         * 1.Beetle类上开始运行,访问main方法
         * 2.找到Beetle类的编译代码,此时注意到有个父类Insect
         * 3.然后继续加载Insect,如果还有父类,就以此类推.从父类加载到子类.
         * 4.这里是先加载Insect,再加载Beetle.
         * 5.加载Insect时发现有静态成员x1,所以输出"static Insect.x1初始化"
         * 6.接下来回到子类Beetle,找到静态成员x2,输出"static Beetle.x2 初始化"
         * 7.接着运行main方法里面的sysout
         * 8.执行new Beetle()
         * 9.应该是调用Beetle的构造器,因为Beetle继承了Insect,所以先调用父类Insect的构造器
         * 10.然后调用Insect的构造器,输出"i=... j=..."
         * 11.回到子类,创建k,输出"Beetle.k初始化"
         * 12.输出Beetle构造器内容"k=... j=..."
         */
        
        /* 
         * 总结:
         * 程序的启动入口在哪个类,哪个类就先加载,如果有继承,会找到父类
         * 只要有静态实例成员,会在启动入口执行之前,要先被初始化
         * 
         * 类加载的过程中:
         *   如果有父类,则先执行父类的静态变量,然后执行子类的静态变量,
         *   然后父类的普通变量,然后父类的构造方法
         *   然后子类的普通变量,然后子类的构造方法
         */
    }

}
