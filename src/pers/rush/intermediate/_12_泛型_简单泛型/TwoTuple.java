package pers.rush.intermediate._12_泛型_简单泛型;

/**
 * 两个元组
 * @author RUSH
 *
 */
public class TwoTuple<A,B> {
	public final A first;
	public final B second;
	public TwoTuple(A a, B b) {
		first = a;
		second = b; 
	}
	@Override
	public String toString() {
		return "(" + first + "," + second + ")";
	}
}
