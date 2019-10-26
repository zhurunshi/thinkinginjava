package pers.rush.intermediate._16_泛型_擦除的神秘之处;

public class Manipulator<T extends HasF> {
	private T obj;
	public Manipulator (T x) {
		obj = x;
	}
	
	public void manipulate() {
		obj.f();
		// 因为泛型的类型信息，不知道obj对象是什么类型的
		// 必须让T extends HasF
		// 泛型就把类型T擦除到HasF的边界上
	}
	
	public static void main(String[] args) {
		HasF hf = new HasF();
		Manipulator<HasF> manipulator = new Manipulator<HasF>(hf); 
		manipulator.manipulate();
	}
}
