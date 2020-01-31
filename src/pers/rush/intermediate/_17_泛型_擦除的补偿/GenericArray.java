package pers.rush.intermediate._17_泛型_擦除的补偿;

public class GenericArray<T> {
	private T[] array;
	public GenericArray(int sz) {
		// 无法声明T类型的数组，只能声明Object类型的数组，然后把它强制转型
		array = (T[]) new Object[sz];
	}
	public void put(int index, T item) {
		array[index] = item;
	}
	public T get(int index) {
		return array[index];
	}
	public T[] rep() {
		return array;
	}
	public static void main(String[] args) {
		GenericArray<Integer> gai = new GenericArray<Integer>(10);
		// 因为有泛型的擦除，所以在接受的时候，必须用Object类型接受，不能用T或者Integer
		Object[] oa = gai.rep();
//		Integer[] oi = gai.rep();
	}
}
