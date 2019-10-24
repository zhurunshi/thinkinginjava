package pers.rush.intermediate._14_泛型_泛型方法;

import java.util.List;
import java.util.Map;

import pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets.Pet;

/**
 * 限制的推断<==>ExplicitTypeSpecification
 * @author RUSH
 *
 */
public class LimitsOfInference {
	static void f(Map<Person, List<? extends Pet>> petPeople) {
		
	}
	
	public static void main(String[] args) {
		/*
		 * 方法调用时就不起作用了
		 * 仅从jdk1.8开始可以这样写
		 */
		f(New.map());
	}
}
