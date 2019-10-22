package pers.rush.intermediate._13_泛型_泛型接口;

public class Coffee {
	private static long counter = 0;
	private final long ID = counter++;
	
	@Override
	public String toString() {
		return getClass().getSimpleName() + " " + ID;
	}
}

class Latte extends Coffee {
	
}

class Mocha extends Coffee {
	
}

class Cappuccino extends Coffee {
	
}

/**
 * 美式咖啡
 * @author RUSH
 *
 */
class Americano extends Coffee {
	
}

/**
 * 半拿铁咖啡
 * @author RUSH
 *
 */
class Breve extends Coffee {
	
}