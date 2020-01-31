package pers.rush.intermediate._17_泛型_擦除的补偿;

interface IFactory<T> {
	T create();
}

class Foo2<T>{
	private T x;
	public <F extends IFactory<T>> Foo2(F factory) {
		this.x = factory.create();
	}
}

class IntegerFactory implements IFactory<Integer> {
	@Override
	public Integer create() {
		return new Integer(0);
	}
}

class Widget {
	public static class Factory implements IFactory<Widget>{
		@Override
		public Widget create() {
			return new Widget();
		}
	}
}

/**
 * 工厂约束
 * @author RUSH
 *
 */
public class FactoryConstraint {
	public static void main(String[] args) {
		// 利用工厂的方式，传递工厂的对象，创建泛型的实例
		new Foo2<Integer>(new IntegerFactory());
		new Foo2<Widget>(new Widget.Factory());
	}
}
