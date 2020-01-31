package pers.rush.intermediate._17_泛型_擦除的补偿;

/**
 * 擦除类
 * @author RUSH
 *
 * @param <T>
 */
public class Erased<T> {
	private final int SIZE = 100;
	public static void f(Object arg) {
		// 判断传入的arg是否是T类型
//		if (arg instanceof T) { // 因为擦除了，所以无法判断
//			T var = new T();
//		}
//		T[] array = new T[SIZE]; // 因为类型信息没有了，所以也不行
		
	}
}
