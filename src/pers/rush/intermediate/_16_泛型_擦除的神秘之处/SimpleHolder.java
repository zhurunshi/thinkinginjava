package pers.rush.intermediate._16_泛型_擦除的神秘之处;

public class SimpleHolder {
	private Object obj;
	public void set(Object obj) {
		this.obj = obj;
	}
	public Object get() {
		return obj;
	}
	public static void main(String[] args) {
		SimpleHolder holder = new SimpleHolder();
		holder.set("Item");
		String s = (String) holder.get();
		System.out.println(s);
	}
}
