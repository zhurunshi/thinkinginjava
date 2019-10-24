package pers.rush.intermediate._14_泛型_泛型方法;

import pers.rush.intermediate._13_泛型_泛型接口.Generator;

public class BasicGeneratorDemo {
	public static void main(String[] args) {
		Generator<CountedObject> gen = BasicGenerator.create(CountedObject.class);
		for(int i = 0; i < 5; i++) {
			System.out.println(gen.next());
		}
	}
}
