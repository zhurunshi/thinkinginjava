package pers.rush.intermediate._11_类型信息_接口与类型信息;

/**
 * 反射获取匿名内部类
 * @author RUSH
 *
 */
class AnnonymousA {
	public static A makeA() {
		return new A() {
			public void f() {
				System.out.println("public AnnonymousA.$.f()");
			}
			public void g() {
				System.out.println("public AnnonymousA.$.g()");
			} 
			void u() {
				System.out.println("package AnnonymousA.$.u()");
			}
			protected void v() {
				System.out.println("protected AnnonymousA.$.v()");
			}
			private void w() {
				System.out.println("private AnnonymousA.$.w()");
			}
		};
	}
}

public class AnnonymousImplementation {
	public static void main(String[] args) throws Exception {
		A a = AnnonymousA.makeA();
		a.f();
		System.out.println(a.getClass().getName());
		// 想访问C对象的方法
		HiddenImplementation.callHiddenMethod(a, "g");
		HiddenImplementation.callHiddenMethod(a, "u");
		HiddenImplementation.callHiddenMethod(a, "v");
		HiddenImplementation.callHiddenMethod(a, "w");
	}
}
