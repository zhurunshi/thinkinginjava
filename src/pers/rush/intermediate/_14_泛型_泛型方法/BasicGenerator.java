package pers.rush.intermediate._14_泛型_泛型方法;

import pers.rush.intermediate._13_泛型_泛型接口.Generator;

/**
 * 通用生成器
 * @author RUSH
 *
 * @param <T>
 */
public class BasicGenerator<T> implements Generator<T> {
	private Class<T> type;
	
	public BasicGenerator(Class<T> type) {
		this.type = type;
	}
	@Override
	public T next() {
		try {
			
			return type.newInstance();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	public static <T> Generator<T> create(Class<T> type) {
		return new BasicGenerator<T>(type);
	}
}
