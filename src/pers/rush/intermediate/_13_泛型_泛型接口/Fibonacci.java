package pers.rush.intermediate._13_泛型_泛型接口;

public class Fibonacci implements Generator<Integer> {
	private int count = 0;
	@Override
	public Integer next() {
		return fib(count++);
	}
	
	private Integer fib(int n) {
		if (n < 2) {
			return 1;
		} else {
			 return fib(n - 2) + fib(n - 1);
		}
	}
	
	public static void main(String[] args) {
		Fibonacci gen = new Fibonacci();
		for (int i = 0; i < 18; i++) {
			System.out.print(gen.next() + " ");
		}
	}
}
