package pers.rush.beginner;

class Counter {
    int i; // 先是0
    Counter() {
        i = 7; // 再是7
    }
}

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
    
public class _20_构造器初始化 {

    public static void main(String[] args) {
        
    }

}
