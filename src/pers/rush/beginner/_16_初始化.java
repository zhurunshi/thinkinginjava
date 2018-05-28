package pers.rush.beginner;

public class _16_初始化 {

	void f1(char x) { System.out.print("f1(char)"); }
	void f1(byte x) { System.out.print("f1(byte)"); }
	void f1(short x) { System.out.print("f1(short)"); }
	void f1(int x) { System.out.print("f1(int)"); }
	void f1(long x) { System.out.print("f1(long)"); }
	void f1(float x) { System.out.print("f1(float)"); }
	void f1(double x) { System.out.print("f1(double)"); }
	
	void f2(byte x) { System.out.print("f2(byte)"); }
	void f2(short x) { System.out.print("f2(short)"); }
	void f2(int x) { System.out.print("f2(int)"); }
	void f2(long x) { System.out.print("f2(long)"); }
	void f2(float x) { System.out.print("f2(float)"); }
	void f2(double x) { System.out.print("f2(double)"); }
	
	void f3(short x) { System.out.print("f3(short)"); }
	void f3(int x) { System.out.print("f3(int)"); }
	void f3(long x) { System.out.print("f3(long)"); }
	void f3(float x) { System.out.print("f3(float)"); }
	void f3(double x) { System.out.print("f3(double)"); }
	
	void f4(int x) { System.out.print("f4(int)"); }
	void f4(long x) { System.out.print("f4(long)"); }
	void f4(float x) { System.out.print("f4(float)"); }
	void f4(double x) { System.out.print("f4(double)"); }
	
	void f5(long x) { System.out.print("f5(long)"); }
	void f5(float x) { System.out.print("f5(float)"); }
	void f5(double x) { System.out.print("f5(double)"); }
	
	void f6(float x) { System.out.print("f6(float)"); }
	void f6(double x) { System.out.print("f6(double)"); }
	
	void f7(double x) { System.out.print("f7(double)"); }
	
	void testConstVal() {
		System.out.print("5:");
		f1(5);f2(5);f3(5);f4(5);f5(5);f6(5);f7(5);
		System.out.println();
	}
	
	void testChar() {
		char x = 'x';
		System.out.print("char:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	void testByte() {
		byte x = 0;
		System.out.print("byte:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	void testShort() {
		short x = 0;
		System.out.print("short:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	void testInt() {
		int x = 0;
		System.out.print("int:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	void testLong() {
		long x = 0;
		System.out.print("long:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	void testFloat() {
		float x = 0;
		System.out.print("float:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	void testDouble() {
		double x = 0;
		System.out.print("double:");
		f1(x);f2(x);f3(x);f4(x);f5(x);f6(x);f7(x);
		System.out.println();
	}
	
	public static void main(String[] args) {
		/* 如果不写构造器,编译器会自动给你一个无参构造器
		 * 如果写了带参数的构造器,编译器就不会自动添加无参构造器了
		 * 构造器可以重载
		 * 不能指定返回类型
		 * 方法重载:1.名称相同;2.参数结构不同;3.返回值可以相同也可以不同
		 */
		
		/* 有int先找int,常量默认就是int类型
		 * f5:long是整形的,长整型,会隐式转换
		 * f6:常量可以直接给float赋值
		 * f7:没得选了,也可以转换成double
		 */
		_16_初始化 初始化 = new _16_初始化();
		初始化.testConstVal();
		初始化.testChar(); // char找不到匹配类型,就会找int(类型提升)
		初始化.testByte();
		初始化.testShort();
		初始化.testInt();
		初始化.testLong();
		初始化.testFloat();
		初始化.testDouble(); 
		
		/* 总结: char 提升会直接变成int
		 * short byte则会一步一步提升
		 */
		
	}

}
