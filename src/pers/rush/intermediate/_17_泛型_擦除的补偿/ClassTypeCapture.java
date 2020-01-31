package pers.rush.intermediate._17_泛型_擦除的补偿;

class Building{}

class House extends Building{}

/**
 * 类型捕获
 * @author RUSH
 *
 */
public class ClassTypeCapture<T> {
	Class<T> kind;
	// 利用构造器传递类型信息
	public ClassTypeCapture(Class<T> kind) {
		this.kind = kind;
	}
	public boolean f(Object arg) {
		return kind.isInstance(arg);
	}
	
	public static void main(String[] args) {
		ClassTypeCapture<Building> ctt1 = 
				new ClassTypeCapture<Building>(Building.class);
		System.out.println(ctt1.f(new Building())); // true
		System.out.println(ctt1.f(new House())); // true
		ClassTypeCapture<House> ctt2 = 
				new ClassTypeCapture<House>(House.class);
		System.out.println(ctt2.f(new Building())); // false
		System.out.println(ctt2.f(new House())); // true
	}
}
