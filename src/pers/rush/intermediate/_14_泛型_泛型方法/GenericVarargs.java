package pers.rush.intermediate._14_泛型_泛型方法;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型可变参数
 * @author RUSH
 *
 */
public class GenericVarargs {
	public static <T> List<T> makeList(T... args) {
		List<T> result = new ArrayList<T>();
		for (T item : args) {
			result.add(item);
		}
		return result;
	}
	public static void main(String[] args) {
		List<String> ls = makeList("A");
		System.out.println(ls);
		ls = makeList("A", "B", "C");
		System.out.println(ls);
		ls = makeList("ABCDEFGHIJKLMNOPQRSTUVWXYZ".split(""));
		System.out.println(ls);
	} 
}
