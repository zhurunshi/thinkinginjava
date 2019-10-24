package pers.rush.intermediate._14_泛型_泛型方法;

import java.util.ArrayList;
import java.util.Collection;

import pers.rush.intermediate._13_泛型_泛型接口.Coffee;
import pers.rush.intermediate._13_泛型_泛型接口.CoffeeGenerator;
import pers.rush.intermediate._13_泛型_泛型接口.Fibonacci;
import pers.rush.intermediate._13_泛型_泛型接口.Generator;

public class Generators {
	/**
	 * 用gen生成对象往集合coll里填充
	 * @param <T>
	 * @param coll
	 * @param gen
	 * @param n
	 * @return
	 */
	public static <T> Collection<T> fill(Collection<T> coll,
			Generator<T> gen, int n) {
		for(int i = 0; i < n; i++) {
			coll.add(gen.next());
		}
		return coll;
	}
	public static void main(String[] args) {
		Collection<Coffee> coffees = fill(new ArrayList<Coffee>(),
				new CoffeeGenerator(), 4);
		for(Coffee c : coffees) {
			System.out.println(c);
		}
		Collection<Integer> fnumbers = fill(new ArrayList<Integer>(),
				new Fibonacci(), 12);
		for(Integer i : fnumbers) {
			System.out.print(i + " ");
		}
	}
}
