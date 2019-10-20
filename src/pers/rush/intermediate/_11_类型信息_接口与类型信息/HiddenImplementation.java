package pers.rush.intermediate._11_类型信息_接口与类型信息;

import java.lang.reflect.Method;

public class HiddenImplementation {
	public static void main(String[] args) throws Exception {
		 A a = HiddenC.makeA();
		 a.f();
		 // 想访问C对象的方法
		 callHiddenMethod(a, "g");
		 callHiddenMethod(a, "u");
		 callHiddenMethod(a, "v");
		 callHiddenMethod(a, "w");
		 
	}
	static void callHiddenMethod(Object a, String methodName) throws Exception {
		Method m = a.getClass().getDeclaredMethod(methodName);
		m.setAccessible(true); // 如果是私有的，设置为true，就允许访问私有成员了
		m.invoke(a);
	}
}
