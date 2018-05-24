package pers.rush.beginner;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class _04_高精度数字 {

	public static void main(String[] args) {
		float f1 = 123.01f + 2.01f;
		System.out.println(f1);
		System.out.println(123.01 + 2.01); // double
		
		BigInteger bigInt1 = new BigInteger("125");
		BigInteger bigInt2 = new BigInteger("999");
		BigInteger result = bigInt1.add(bigInt2);
		System.out.println(result);
		result = bigInt2.subtract(bigInt1);
		System.out.println(result);
		
		BigDecimal bigDec1 = new BigDecimal("123.01");
		BigDecimal bigDec2 = new BigDecimal("2.01");
		BigDecimal resultDecimal;
		resultDecimal = bigDec1.add(bigDec2);
		System.out.println(resultDecimal);
		
	}

}
