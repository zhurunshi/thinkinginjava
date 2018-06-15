package pers.rush.beginner._31_多态_转机;

class Derived extends PrivateOverride{
    public void f() {
        System.out.println("public f()");
    }
}

public class PrivateOverride {
    private void f() {
        System.out.println("private f()");
    }
    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f(); // 打印private f() 因为main入口在这个类里面
    }
}
