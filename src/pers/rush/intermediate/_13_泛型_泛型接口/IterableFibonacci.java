package pers.rush.intermediate._13_泛型_泛型接口;

import java.util.Iterator;

public class IterableFibonacci extends Fibonacci implements Iterable<Integer> {
	private int n;
	
	public IterableFibonacci(int count) {
		n = count;
	}
	@Override
	public Iterator<Integer> iterator() {
		return new Iterator<Integer>() {
			public boolean hasNext() {
				return n > 0;
			}
			public Integer next() {
				n--;
				return IterableFibonacci.this.next();
			}
			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}
		};
	}
	
	public static void main(String[] args) {
		for (Integer i : new IterableFibonacci(18)) {
			System.out.print(i + " ");
		}
	}
}
