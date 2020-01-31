package pers.rush.intermediate._17_泛型_擦除的补偿;

public class GenericArray2<T> {
	private Object[] array;
	public GenericArray2(int sz) {
		// 无法声明T类型的数组，只能声明Object类型的数组，然后把它强制转型
		array = new Object[sz];
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return (T) array[index];
	}
	public T[] rep() {
		return (T[]) array;
	}
	public static void main(String[] args) {
		GenericArray2<Integer> gai = new GenericArray2<Integer>(10);
		for (int i = 0; i < 10; i++) {
			gai.put(i, i);
		}
		for (int i = 0; i < 10; i++) {
			System.out.print(gai.get(i) + " ");
		}
		System.out.println();
//		Integer[] oi = gai.rep();
		Object[] oo = gai.rep();
	}
}
