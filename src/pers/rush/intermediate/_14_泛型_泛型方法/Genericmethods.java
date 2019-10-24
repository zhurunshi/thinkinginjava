package pers.rush.intermediate._14_泛型_泛型方法;

public class Genericmethods {
	// 在返回值之前先指定类型<T>
	public <T> void f(T x) {
		System.out.println(x.getClass().getName());
	}
	
	public static void main(String[] args) {
		Genericmethods gm = new Genericmethods();
		// 用的时候不用指明参数类型，这就称之为：类型参数推断。
		gm.f(""); // java.lang.String
		gm.f(1); // java.lang.Integer
		gm.f(1.0); // java.lang.Double
		gm.f(1.0F); // java.lang.Float
		gm.f('c'); // java.lang.Character
		gm.f(gm); // pers.rush.intermediate._14_泛型_泛型方法.Genericmethods
	}
}
