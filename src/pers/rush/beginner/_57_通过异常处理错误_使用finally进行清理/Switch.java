package pers.rush.beginner._57_通过异常处理错误_使用finally进行清理;
public class Switch {

    private boolean state = false; // 开关状态
    public boolean read() {
        return state;
    }
    public void on() {
        state = true;
        System.out.println(this);
    }
    public void off() {
        state = false;
        System.out.println(this);
    }
    
    @Override
    public String toString() {
        return state ? "on" : "off";
    }
    
    public static void main(String[] args) {
        /*
         * 无论try发生什么,内存都可以得到释放
         * Java什么情况用finally?
         * 当要把除内存之外的资源恢复到初始状态时
         * Java的内存有垃圾回收机制
         * 当打开文件需要关闭的时候,或者网络连接,数据库占用,屏幕上画的图形
         */
        
    }

}
