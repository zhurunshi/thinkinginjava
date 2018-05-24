package pers.rush.beginner;

public class _08_数组_多维数组 {

	public static void main(String[] args) {
		// 二维数组声明格式,以下均可以
		int[][] intArray;
		int[] intArray2[];
//		char charArray[][];
		
		int[][][] array3; // 三维数组 
		
		intArray = new int[3][5]; // 直接分配,平衡二维数组:每行的列数是一样的,也叫矩阵.
		intArray2 = new int[3][]; // 非平衡数组
		intArray2[0] = new int[4];
		intArray2[1] = new int[3];
		intArray2[1] = new int[5];
		// 静态初始化创建,必须在声明的同时初始化
		char charArray[][] = {{'a', 'b', 'c'}, {'a'}, {'c'}, {'d'}}; 
		
	}

}
