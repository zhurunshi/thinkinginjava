package pers.rush.beginner;

import java.text.NumberFormat;

public class _08_interest {

	public static void main(String[] args) {
		/* 假设有10000元,想按照6种年利率(10%-15%)规格存入银行
		 * 列出10年,每一年年底存款+利息
		 */
		
		final int START_RATE = 10; // 起始利率10%
		final int RATES = 6; // 6种利率
		final int YEARS = 10; // 循环10年 看每年年底的本金+利息是多少
		double[] interestRate = new double[RATES];
		for(int i = 0; i < interestRate.length; ++i) {
			interestRate[i] = (START_RATE + i) / 100.0;
		}
		double[][] balance = new double[YEARS][RATES];
		// 第一年 全都是10000元
		for (int i = 0; i < balance[0].length; ++i) { 
			balance[0][i] = 10000;
		}
		for (int i = 1; i < balance.length; ++i) {
			for (int j = 0; j < balance[i].length; ++j) {
				balance[i][j] = balance[i - 1][j] * (1 + interestRate[j]);
				System.out.println(interestRate[j]);
			}
		}
		
		System.out.println("=================");
		for (int i = 0; i < balance.length; ++i) {
			for (int j = 0; j < balance[i].length; ++j) {
				System.out.print(String.format("%.4f", balance[i][j]) + " ");
			}
			System.out.println();
		}
		System.out.println("=================");
		NumberFormat format = NumberFormat.getCurrencyInstance();
		for (int i = 0; i < balance.length; ++i) {
			for (int j = 0; j < balance[i].length; ++j) {
				System.out.print(format.format(balance[i][j]) + " ");
			}
			System.out.println();
		}
		// 数组的复制
		int[] smallPrimes = {2, 3, 5, 7, 11, 13};
		int[] luckyNumbers = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
		System.arraycopy(smallPrimes, 2, luckyNumbers, 3, 4);
		System.out.println("=================");
		for (int i : luckyNumbers) {
			System.out.print(i + " ");
		}
	}

}
