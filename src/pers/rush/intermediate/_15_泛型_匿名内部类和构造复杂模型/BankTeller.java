package pers.rush.intermediate._15_泛型_匿名内部类和构造复杂模型;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

import pers.rush.intermediate._13_泛型_泛型接口.Generator;
import pers.rush.intermediate._14_泛型_泛型方法.Generators;

/**
 * 客户
 * @author RUSH
 *
 */
class Customer {
	private static long counter = 1;
	private final long id = counter++;
	private Customer() {}
	
	@Override
	public String toString() {
		return "Customer " + id;
	}
	
	public static Generator<Customer> generator() {
		// 将泛型用在匿名泛型内部类
		return new Generator<Customer>() {
			@Override
			public Customer next() {
				return new Customer();
			}
		};
	}
}

/**
 * 柜员
 * @author RUSH
 *
 */
class Teller {
	private static long counter = 1;
	private final long id = counter++;
	private Teller() {}
	@Override
	public String toString() {
		return "Teller " + id;
	}
	public static Generator<Teller> generator() {
		return new Generator<Teller>() {
			@Override
			public Teller next() {
				return new Teller();
			}
		};
	}
}

/**
 * 银行柜员
 * @author RUSH
 *
 */
public class BankTeller {
	public static void serve(Teller t, Customer c) {
		System.out.println(t + " Serves " + c);
	}
	public static void main(String[] args) {
		Random rand = new Random(47);
		Queue<Customer> line = new LinkedList<Customer>();
		Generators.fill(line, Customer.generator(), 15);
		List<Teller> tellers = new ArrayList<Teller>();
		Generators.fill(tellers, Teller.generator(), 4);
		for(Customer c : line) {
			serve(tellers.get(rand.nextInt(tellers.size())), c);
		}
	}
}
