package pers.rush.beginner;

class MyClass {
	private String 私有变量; // 最小范围,当前类内部可以访问
	public String 公共变量; // 最大范围
	protected String 受保护的变量; // 同包下的类,不同包的子类可以访问
	String 默认包变量; // 同包内可以访问
	
	public static String 静态变量; // 全局变量
}

public class _06_类和成员的修饰符 {

	public static void main(String[] args) {
		/*
		 * final修饰类说明类不能被继承
		 * final修饰变量说明变量不能被修改 加final就是常量了
		 * final修饰方法说明方法不允许被覆盖,但可以重载
		 * 
		 * 继承了抽象类,必须把抽象类中的抽象方法实现
		 * 抽象类只能声明,不能new
		 * 一个抽象类中可以没有抽象方法,但是只要有一个抽象方法,必须定义为抽象类
		 * 
		 */
	}

}
