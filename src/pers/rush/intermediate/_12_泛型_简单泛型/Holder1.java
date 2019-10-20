package pers.rush.intermediate._12_泛型_简单泛型;

/**
 * 汽车
 * @author RUSH
 *
 */
class Automobile {}

/**
 * 只能持有单个对象的类
 * @author RUSH
 *
 */
public class Holder1 {
	private Automobile a;
	public Holder1(Automobile a) {
		this.a = a;
	}
	Automobile get() {
		return a;
	}
}
