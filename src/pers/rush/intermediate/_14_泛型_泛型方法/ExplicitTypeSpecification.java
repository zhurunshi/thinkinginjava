package pers.rush.intermediate._14_泛型_泛型方法;

import java.util.List;
import java.util.Map;

import pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets.Pet;

/**
 * 显式类型规范<==>LimitsOfInference
 * @author RUSH
 *
 */
public class ExplicitTypeSpecification {
	static void f(Map<Person, List<Pet>> petPeople) {
		
	}
	public static void main(String[] args) {
		// 显式类型说明
		f(New.<Person, List<Pet>>map());
	}
}
