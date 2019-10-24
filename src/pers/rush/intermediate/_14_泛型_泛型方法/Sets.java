package pers.rush.intermediate._14_泛型_泛型方法;

import java.util.HashSet;
import java.util.Set;

/**
 * 集合运算工具类
 * @author RUSH
 *
 */
public class Sets {
	/**
	 * 并运算
	 * @param <T>
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> union(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		// 把b里的数据全部加到a里面
		result.addAll(b);
		return result;
	}
	/**
	 * 交集运算
	 * @param <T>
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> intersection(Set<T> a, Set<T> b) {
		Set<T> result = new HashSet<T>(a);
		// 保留运算：a里面保留和b里面相同的
		result.retainAll(b);
		return result;
	}
	
	/**
	 * 差运算
	 * @param <T>
	 * @param superset 被减数
	 * @param subset 减数
	 * @return
	 */
	public static <T> Set<T> difference(Set<T> superset, Set<T> subset) {
		Set<T> result = new HashSet<T>(superset);
		// superset - subset
		result.removeAll(subset);
		return result;
	}
	
	/**
	 * 补充运算：a和b相同的都去掉，剩下的保留
	 * @param <T>
	 * @param a
	 * @param b
	 * @return
	 */
	public static <T> Set<T> complement(Set<T> a, Set<T> b) {
		return difference(union(a, b), intersection(a, b));
	}
}
