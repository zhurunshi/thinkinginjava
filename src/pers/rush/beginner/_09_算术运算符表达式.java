package pers.rush.beginner;

public class _09_算术运算符表达式 {

	public static void main(String[] args) {
		/* 运算由表达式表示
		 * 表达式由运算符和运算分量组成
		 * 运算分量可以是常量,也可以是变量,还可以是有返回值的方法
		 * 运算符按功能划分:
		 * 赋值/算术/关系/逻辑/条件/位
		 * 按运算符操作的操作数数量分:
		 * 一元运算符(单目运算符)/二元(双目)/三元
		 * 一元: ++ -- + - (正负,不是加减)
		 * 二元: + - * / % < > <= >= !=(<>) ==
		 * 三元: ?: 
		 */
		byte x = 3;
		byte y = 4;
		long r = 80L;
		int t = (int) (r / y); // 结果是long类型
		byte b = (byte) (x * y); // 结果自动变成int
		float z = 12.5f;
		float w = 5.5f;
		System.out.println("==================");
		int l = 3, m = 4, n = 5;
		String s = "lmn=";
		System.out.println(l + m + n);
		System.out.println(s + l + m + n);
		System.out.println(l + m + n + s);
		/* 算术运算符优先级
		 * 最高的:前++ 前--
		 * 中等:* / %
		 * 最低:+ -
		 * 最最低:后-- 后++
		 */
		
	}

}
