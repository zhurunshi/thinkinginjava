package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;

class OnOffException1 extends Exception {
    
}

class OnOffException2 extends Exception {
    
}

public class OnOffSwitch {

    private static Switch sw = new Switch();
    
    public static void f() throws OnOffException1, OnOffException2 {
        throw new OnOffException1();
    }
    
    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off(); // 不管出不出错,都会执行这一行
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
            sw.off(); // 不管出不出错,都会执行这一行
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off(); // 不管出不出错,都会执行这一行
        }
    }

}
