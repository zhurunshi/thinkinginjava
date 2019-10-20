package pers.rush.intermediate._11_类型信息_接口与类型信息;

/**
 * 反射获取内部类
 * @author RUSH
 *
 */
class InnerA {
	private static class C implements A {
		public void f() {
			System.out.println("public InnerA.C.f()");
		}
		public void g() {
			System.out.println("public InnerA.C.g()");
		} 
		void u() {
			System.out.println("package InnerA.C.u()");
		}
		protected void v() {
			System.out.println("protected InnerA.C.v()");
		}
		private void w() {
			System.out.println("private InnerA.C.w()");
		}
	}
	public static A makeA() {
		return new C();
	}
}

public class InnerImplementation {
	public static void main(String[] args) throws Exception {
		 A a = InnerA.makeA();
		 a.f();
		 System.out.println(a.getClass().getName());
		 // 想访问C对象的方法
		 HiddenImplementation.callHiddenMethod(a, "g");
		 HiddenImplementation.callHiddenMethod(a, "u");
		 HiddenImplementation.callHiddenMethod(a, "v");
		 HiddenImplementation.callHiddenMethod(a, "w");
		 
	}
}
