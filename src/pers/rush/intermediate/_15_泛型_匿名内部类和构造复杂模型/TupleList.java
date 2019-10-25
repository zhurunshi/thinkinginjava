package pers.rush.intermediate._15_泛型_匿名内部类和构造复杂模型;

import java.util.ArrayList;

import pers.rush.intermediate._12_泛型_简单泛型.Amphibian;
import pers.rush.intermediate._12_泛型_简单泛型.FourTuple;
import pers.rush.intermediate._12_泛型_简单泛型.TupleTest;
import pers.rush.intermediate._12_泛型_简单泛型.Vehicle;

public class TupleList<A,B,C,D> extends ArrayList<FourTuple<A,B,C,D>> {
	public static void main(String[] args) {
		TupleList<Vehicle, Amphibian, String, Integer> t1 = new TupleList<>();
		t1.add(TupleTest.h());
		t1.add(TupleTest.h());
		for(FourTuple<Vehicle, Amphibian, String, Integer> i : t1) {
			System.out.println(i);
		}
	}
}
