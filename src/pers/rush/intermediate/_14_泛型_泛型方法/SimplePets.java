package pers.rush.intermediate._14_泛型_泛型方法;

import java.util.List;
import java.util.Map;

import pers.rush.intermediate._07_类型信息_类型转换前先做检查.typeinfo.pets.Pet;

class Person {}


public class SimplePets {
	public static void main(String[] args) {
		// 赋值情况下，类型推断是有效的，其他情况是不起作用的
		Map<Person, List<? extends Pet>> petPeople = New.map();
	}
}
