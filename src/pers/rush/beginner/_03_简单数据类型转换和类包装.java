package pers.rush.beginner;

public class _03_简单数据类型转换和类包装 {

	public static void main(String[] args) {
		/*
		 * byte,short,char->int->long->float->double
		 * 各类简单数据类型的自动转换规则
		 */
		byte b1 = 1;
		byte b2 = 2;
		byte b3 = (byte) (b1 + b2); // 中间会变成int
		
	}

}
