package pers.rush.intermediate._16_泛型_擦除的神秘之处;

public class GenericHolder<T> {
	private T obj;
	public void set(T obj) {
		this.obj = obj;
	}
	public T get() {
		return obj;
	}
	public static void main(String[] args) {
		GenericHolder<String> holder = new GenericHolder<String>();
		holder.set("item"); // 赋值时会检查类型
		String s = holder.get(); // 返回的时候程序自己给我们转型了，所以就不需要强制转型了
	}
}
