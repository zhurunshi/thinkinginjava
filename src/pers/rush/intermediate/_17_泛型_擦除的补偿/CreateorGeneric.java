package pers.rush.intermediate._17_泛型_擦除的补偿;

/**
 * 模板类
 * @author RUSH
 *
 * @param <T>
 */
abstract class GenericWithCreate<T>{
	final T element;
	GenericWithCreate(){
		element = create();
	}
	abstract T create();
}

class X{}

class Creator extends GenericWithCreate<X>{
	@Override
	X create() {
		return new X();
	}
	void f() {
		System.out.println(element.getClass().getSimpleName());
	}
}

public class CreateorGeneric {
	public static void main(String[] args) {
		Creator c = new Creator();
		c.f();
	}
}
