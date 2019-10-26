package pers.rush.intermediate._16_泛型_擦除的神秘之处;

import java.util.ArrayList;

/**
 * 擦除类型等价
 * @author RUSH
 *
 */
public class ErasedTypeEquivalence {
	public static void main(String[] args) {
		Class c1 = new ArrayList<String>().getClass();
		Class c2 = new ArrayList<Integer>().getClass();
		System.out.println(c1 == c2); // true
	}
}
