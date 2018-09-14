package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;
public class WithFinally {
    private static Switch sw = new Switch();
    
    public static void main(String[] args) {
        try {
            sw.on();
            OnOffSwitch.f();
        } catch (OnOffException1 e) {
            System.out.println("OnOffException1");
        } catch (OnOffException2 e) {
            System.out.println("OnOffException2");
        } finally {
            sw.off();
        }
        
        try {
            // try要么跟着catch,要么跟着finally; 不能单独存在
        } finally {
            
        }
    }

}
