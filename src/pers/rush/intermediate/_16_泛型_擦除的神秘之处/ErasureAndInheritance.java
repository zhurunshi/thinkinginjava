package pers.rush.intermediate._16_泛型_擦除的神秘之处;

class GenericBase<T> {
	private T element;
	public void set(T arg) {
		element = arg;
	}
	public T get() {
		return element;
	}
}

/**
 * 派生类1
 * @author RUSH
 *
 * @param <T>
 */
class Derived1<T> extends GenericBase<T> {}

/**
 * 派生类2
 * 可以继承泛型，也可以不继承泛型
 * @author RUSH
 *
 * @param <T>
 */
class Derived2 extends GenericBase {}

/**
 * 泛型和继承
 * @author RUSH
 *
 */
public class ErasureAndInheritance {
	public static void main(String[] args) {
		Derived2 d2 = new Derived2();
		Object obj = d2.get();
		System.out.println(obj);
		d2.set(obj);
	}
}
