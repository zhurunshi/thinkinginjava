package pers.rush.beginner._33_多态_协变返回类型和用继承进行设计;

class Useful{
    public void f() {}
    public void g() {}
}

class MoreUseful extends Useful{
    public void f() {} // 覆盖
    public void g() {} // 覆盖
    public void u() {}
    public void v() {}
    public void w() {}
    
}

/**
 * 运行时类别识别
 * @author Rush
 *
 */
public class RTTI {
    public static void main(String[] args) {
        Useful[] x = {
                new Useful(),
                new MoreUseful()
        };
        x[0].f();
        x[1].f(); // 只能看到父类类型的方法
        ((MoreUseful) x[1]).u(); // 向下转型 只能强转
        ((MoreUseful) x[0]).u(); // 类型转换异常
        // 向下转型的时候要做必要的检查 类型实例的检查
    }
}
