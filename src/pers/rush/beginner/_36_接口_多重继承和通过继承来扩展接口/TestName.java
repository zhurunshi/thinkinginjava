package pers.rush.beginner._36_接口_多重继承和通过继承来扩展接口;

interface I1 {
    void f();
}

interface I2 {
    int f(int i);
}

interface I3 {
    int f();
}

class C {
    public int f() {
        return 1;
    }
}

class C2 implements I1, I2{

    @Override
    public void f() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public int f(int i) {
        return 1;
    }
    
}

class C3 extends C implements I2 {

    @Override
    public int f(int i) {
        return 1;
    }
    
}

class C4 extends C implements I3 {
    public int f() {
        return 1;
    }
}

/*
class C5 extends C implements I1 {
    // I1要求void f()
    // C要求int f()
    public void f() {
        // 和int f()方法不能兼容
    }
}*/

/*
interface I4 extends I1, I3 {
    // 被扩展的接口里面有方法冲突,名字相同但返回类型不同
}*/

public class TestName {
    
    
    
    public static void main(String[] args) {
        
    }

}
