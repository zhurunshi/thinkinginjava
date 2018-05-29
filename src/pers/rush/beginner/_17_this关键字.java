package pers.rush.beginner;

class Banana {
	int i;
	void peel(int i) {
		this.i = i; // 当前对象自身下的i
		System.out.println("i=" + i);
	}
}

class Apricot { // 杏
	void pick() { }
	void pit() {
		this.pick(); // 没有必要
	}
}

class Leaf {
	int i = 0;
	Leaf increment() {
		++i;
		return this; // 返回leaf实例自身
	}
	void print() {
		System.out.println("i=" + i);
	}
}

public class _17_this关键字 {

	public static void main(String[] args) {
		Banana a = new Banana();
		Banana b = new Banana();
		a.peel(1);
	    b.peel(2);
		System.out.println("--------------------------------------------");
		Leaf leaf = new Leaf();
		leaf.increment().increment().increment().print();
		
		/* this用法:
		 * 1.对当前对象的引用(类的实例)
		 * 2.在构造器中调用构造器
		 * 静态方法是没有this的方法,静态方法内部不能调用非静态方法(实例方法),
		 * 但是反过来可以,实例方法内可以调用静态方法
		 */
	}

}
