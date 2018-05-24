package pers.rush.beginner;

public class _07_数组_一维数组 {
	
	public static void main(String[] args) {
		/*
		 * 数组:是相同类型数据的集合
		 * 一维数组声明有两种格式:
		 * 类型[] 数组名称;
		 * 类型 数组名称[];
		 */
		int[] myIntArray = new int[10]; // 向内存要一块空间 4*10个字节
		String[] myStringArray = new String[15];
		char[] charArray = new char[20];
		myIntArray[0] = 15;
		
		/* 对数组进行初始化
		 * 1.静态初始化
		 * 2.动态初始化
		 */
		int[] intArray = {1, 2, 3, 4, 5}; // 1
		int[] intArray2 = new int[10]; // 2 动态初始化,里面都是0
		for (int i : intArray2) {
			System.out.println(i);
		}
		
		double[] doubleArray = new double[10]; // 2 动态初始化,里面都是0.0
		for (double i : doubleArray) {
			System.out.println(i);
		}
		
		boolean[] booleanArray = new boolean[10]; // 2 动态初始化,里面都是false
		for (boolean i : booleanArray) {
			System.out.println(i);
		}
		
		char[] charArray1 = new char[10]; // 2 动态初始化,里面都是'\u0000'
		for (char i : charArray1) {
			System.out.println(i);
		}
		
		String[] stringArray = new String[10]; // 2 动态初始化,里面都是null
		for (String i : stringArray) {
			System.out.println(i);
		}
		
		Integer[] integerArray = new Integer[10]; // 2 动态初始化,里面都是null
		for (Integer i : integerArray) {
			System.out.println(i);
		}
		
		/* 数组里面其实是引用的地址
		 * 
		 */
	}
	
}
