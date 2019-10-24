package pers.rush.intermediate._14_泛型_泛型方法;

// 静态导入
import static pers.rush.intermediate._14_泛型_泛型方法.Tuple.tuple;

import pers.rush.intermediate._12_泛型_简单泛型.FourTuple;
import pers.rush.intermediate._12_泛型_简单泛型.ThreeTuple;
import pers.rush.intermediate._12_泛型_简单泛型.TwoTuple;

class Amphibian {}
class Vehicle {}

public class TupleTest {
	
	static TwoTuple<String, Integer> f() {
		return tuple("hi", 47);
	}
	static TwoTuple f2() {
		return tuple("hi", 47);
	}
	static ThreeTuple<Amphibian,String,Integer> g() {
		return tuple(new Amphibian(), "hi", 47);
	} 
	static FourTuple<Vehicle, Amphibian,String,Integer> h() {
		return tuple(new Vehicle(), new Amphibian(), "hi", 47);
	} 
	
	public static void main(String[] args) {
		TwoTuple<String, Integer> ttsi = f();
		System.out.println(ttsi);
		System.out.println(f2());
		System.out.println(g());
		System.out.println(h());
	}
}
