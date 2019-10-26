package pers.rush.intermediate._16_泛型_擦除的神秘之处;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Frob {}
class Fnorkle {}
class Quark<Q> {}
class Particle<POSITION,MOMENTUM> {}

/**
 * 丢失的信息
 * @author RUSH
 *
 */
public class LostInformation {
	public static void main(String[] args) {
		List<Frob> list = new ArrayList<>();
		Map<Frob, Fnorkle> map = new HashMap<>();
		Quark<Fnorkle> quark = new Quark<>();
		Particle<Long, Double> p = new Particle<>();
		System.out.println(Arrays.toString(list.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(map.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(quark.getClass().getTypeParameters()));
		System.out.println(Arrays.toString(p.getClass().getTypeParameters()));
		// 反射时，是拿不到泛型内部代码类型信息的，只能拿到泛型定义时的类型信息
	}
}
