package pers.rush.beginner;

public class _02_变量和基本数据类型 {

	public static void main(String[] args) {
		/*
		 * 变量:保存数据的存储单元(容器)
		 * 声明变量语法:类型 变量名称
		 * 基本数据类型:原始数据类型.系统事先规定好的类型
		 * 整数\浮点数\字符类型\布尔
		 * type,short,int,long\float,double\char\boolean
		 * 非基本数据类型:由基本数据类型组合的新类型,例如:数组,字符串,类,接口
		 */
		int octal = 012; // 八进制 =10
		byte byte1 = -128; // 1个字节 -128-127
		System.out.println(byte1);
		short short1 = 2; // 2个字节
		int int1 = 4;// 4个字节
		long long1 = 8; // 8个字节
		float float1 = 23.23F; // 4个字节
		double double1 = 23.1; // 8个字节(可后缀+d)
		System.out.println(Float.NEGATIVE_INFINITY); // 负无穷
		System.out.println(Float.POSITIVE_INFINITY); // 正无穷
		System.out.println(Float.NaN); // 0为分母
		char enter = '\r'; // 回车 2个字节
		char 单引号 = '\''; 
		
	}

}
