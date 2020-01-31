package pers.rush.intermediate._17_泛型_擦除的补偿;

public class ArrayOfGeneric {
	static final int SIZE = 100;
	static Generic<Integer>[] gia;
	public static void main(String[] args) {
		// 会出现类型转换的异常
//		gia = (Generic<Integer>[]) new Object[SIZE];
		// 下面是对的
		gia = (Generic<Integer>[]) new Generic[SIZE];
		System.out.println(gia.getClass().getSimpleName());
		gia[0] = new Generic<Integer>();
	}
}
