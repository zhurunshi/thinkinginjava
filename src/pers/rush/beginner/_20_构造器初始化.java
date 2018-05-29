package pers.rush.beginner;

class Counter {
    int i; // 先是0
    Counter() {
        i = 7; // 再是7
    }
}
//=======================================
class Window {
    Window(int maker) {
        System.out.println("Window(" + maker + ")");
    }
}

class House {
    Window w1 = new Window(1);
    House() {
        System.out.println("House()");
        w3 = new Window(33);
    }
    Window w2 = new Window(2);
    void f() {
        System.out.println("f()");
    }
    Window w3 = new Window(3);
}
    
class Bowl {
    Bowl(int marker) {
        System.out.println("Bowl(" + marker + ")");
    }
    void f1(int marker) {
        System.out.println("Bowl.f1(" + marker + ")"); // 5 // 10 // 14 // 18
    }
}
//=======================================
class Table {
    static Bowl bowl1 = new Bowl(1); // 2 静态的先执行,且只执行一次
    Table() {
        System.out.println("Table()"); // 4
        bowl2.f1(1);
    }
    void f2(int marker) {
        System.out.println("Table. f2(" + marker + ")"); // 19
    }
    static Bowl bowl2 = new Bowl(2); // 3 静态的先执行,且只执行一次
    
}

class Cupboard {
    Bowl bowl3 = new Bowl(3); // 8 // 12 // 16
    static Bowl bowl4 = new Bowl(4); // 6 //  // 18
    Cupboard() {
        System.out.println("Cupboard()"); // 9 // 13 // 17
        bowl4.f1(2);
    }
    void f3(int marker) {
        System.out.println("Cupboard.f3(" + marker + ")"); //20
    }
    static Bowl bowl5 = new Bowl(5); // 7 //13 // 19
}
//=======================================
class Spoon { 
    static int i;
    static { // 静态块,可以把多个静态变量一起初始化,只执行一次,首次执行
        i = 47;
    }
}

class Cup {
    Cup(int marker) {
        System.out.println("Cup(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f(" + marker + ")");
    }
}

class Cups {
    static Cup cup1;
    static Cup cup2;
    static { // 静态块里面只能给静态成员变量赋值
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Cups()");
    }
}
// =======================================
class Mug {
    Mug(int marker) {
        System.out.println("Mug(" + marker + ")");
    }
    void f(int marker) {
        System.out.println("f" + marker + ")");
    }
}

public class _20_构造器初始化 {

    public static void main(String[] args) {
        System.out.println("--------------------------------------------");
        new House().f(); // 一.执行顺序是先实例化变量,再执行构造方法
        System.out.println("--------------------------------------------");
        /* 
         * 静态成员只能写在类里面,不能写在方法里面
         */
        /* 
         * 静态变量如果是基本数据类型,会自动初始化
         */
        // 二.静态数据的初始化顺序测试
        System.out.println("创建一个cupboard.1"); // 11
        new Cupboard();
        System.out.println("创建一个cupboard.2"); // 15
        new Cupboard();
        
        table.f2(1);
        cupborad.f3(1);
        
        System.out.println("-------------静态成员被访问的时候也会导致静态成员的初始化--------------");
        Cups.cup1.f(99); // 注意:静态成员只会被初始化一次.
        
        System.out.println("--------------------------------------------");
        new _20_构造器初始化();
        System.out.println("================");
        new _20_构造器初始化(1);
    }

    Mug mug1;
    Mug mug2;
    {
        // 初始化语句块
        mug1 = new Mug(1);
        mug2 = new Mug(2);
        System.out.println("初始化语句块");
    }
    
    public _20_构造器初始化() {
        System.out.println("_20_构造器初始化()");
    }
    public _20_构造器初始化(int i) {
        System.out.println("_20_构造器初始化(int)");
    }
    
    // 1.先创建两个静态对象 table先执行 然后cupboard
    static Table table = new Table();
    static Cupboard cupborad = new Cupboard();
}