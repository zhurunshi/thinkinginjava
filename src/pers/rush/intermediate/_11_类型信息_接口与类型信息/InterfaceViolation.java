package pers.rush.intermediate._11_类型信息_接口与类型信息;

class B implements A {
	public void f() {}
	public void g() {}
}

public class InterfaceViolation {
	public static void main(String[] args) {
		A a = new B();
		a.f();
		// 反射
		System.out.println(a.getClass().getName()); // 拿到的是B
		if (a instanceof B) {
			// 必须通过强制转型成B才能调用B的方法
			B b = (B) a; 
			b.g(); 
		}
	}
}
