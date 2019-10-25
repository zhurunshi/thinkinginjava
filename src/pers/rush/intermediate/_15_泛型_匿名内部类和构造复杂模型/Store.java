package pers.rush.intermediate._15_泛型_匿名内部类和构造复杂模型;

import java.util.ArrayList;
import java.util.Random;

import pers.rush.intermediate._13_泛型_泛型接口.Generator;
import pers.rush.intermediate._14_泛型_泛型方法.Generators;

/**
 * 商品
 * @author RUSH
 *
 */
class Product {
	private final int id;
	private String description;
	private double price;
	public Product(int id, String description, double price) {
		this.id = id;
		this.description = description;
		this.price = price;
		System.out.println(toString());
	}
	
	@Override
	public String toString() {
		return id + ": " + description + ", price: $" + price;
	}
	
	/**
	 * 涨价
	 * @param change
	 */
	public void priceChange(double change) {
		price += change;
	}
	
	public static Generator<Product> generator = new Generator<Product>() {
		private Random rand = new Random(47);

		@Override
		public Product next() {
			return new Product(rand.nextInt(1000), 
					"Test", Math.round(rand.nextDouble() * 1000) + 0.99);
		}
	};
}

/**
 * 货架
 * @author RUSH
 *
 */
class Shelf extends ArrayList<Product> {
	public Shelf(int nProducts) {
		Generators.fill(this, Product.generator, nProducts);
	}
}

/**
 * 走廊
 * @author RUSH
 *
 */
class Aisle extends ArrayList<Shelf> {
	public Aisle(int nShelves, int nProducts) {
		for(int i = 0; i < nShelves; i++) {
			add(new Shelf(nProducts));
		}
	}
}

/**
 * 收银台
 * @author RUSH
 *
 */
class CheckoutStand {}

/**
 * 办公室
 * @author RUSH
 *
 */
class Office {}

/**
 * 商店
 * @author RUSH
 *
 */
public class Store extends ArrayList<Aisle>{
	// 多个收银台
	private ArrayList<CheckoutStand> checkouts = new ArrayList<>();
	// 一个办公室
	private Office office = new Office();
	
	public Store(int nAisles, int nShelves, int nProducts) {
		for(int i = 0; i < nAisles; i++) {
			add(new Aisle(nShelves, nProducts));
		}
	}
	
	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		for(Aisle a : this) {
			for(Shelf s : a) {
				for(Product p : s) {
					result.append(p)
					.append("\n");
				}
			}
		}
		
		return result.toString();
	}
	
	public static void main(String[] args) {
		// 数量是14 * 5 * 10个产品
		System.out.println(new Store(14, 5, 10));
	}
}
