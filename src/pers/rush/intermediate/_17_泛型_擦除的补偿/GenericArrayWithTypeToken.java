package pers.rush.intermediate._17_泛型_擦除的补偿;

import java.lang.reflect.Array;

/**
 * 指定类型标记的泛型
 * @author RUSH
 *
 * @param <T>
 */
public class GenericArrayWithTypeToken<T> {
	private T[] array;
	public GenericArrayWithTypeToken(Class<T> type, int sz) {
		// 想要拿到数组时不需要转型，必须利用到反射
		array = (T[]) Array.newInstance(type, sz);
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return (T) array[index];
	}
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArrayWithTypeToken<Integer> gai = 
				new GenericArrayWithTypeToken<Integer>(Integer.class, 10);
		for (int i = 0; i < 10; i++) {
			gai.put(i, i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(gai.get(i) + " ");
		}
		System.out.println();
		Integer[] oa = gai.rep();
	}
}
