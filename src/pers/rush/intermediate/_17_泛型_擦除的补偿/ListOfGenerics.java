package pers.rush.intermediate._17_泛型_擦除的补偿;

import java.util.ArrayList;
import java.util.List;

public class ListOfGenerics<T> {
	private List<T> array = new ArrayList<T>();
	public void add(T item) {
		array.add(item);
	}
	public T get(int index) {
		return array.get(index);
	}
}
