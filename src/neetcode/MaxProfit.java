package neetcode;

import java.util.*;
//Input: prices = [7,1,5,3,6,4]
//Output: 5
//Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
//Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.

public class MaxProfit {

	static int maxProfit(int[] prices) {
//		int lsf = Integer.MAX_VALUE; // least so far
//		int op = 0; // overall profit
//		int pist = 0; // price if sold today
//
//		for (int i = 0; i < prices.length; i++) {
//			if (prices[i] < lsf) {
//				lsf = prices[i];
//			}
//			pist = prices[i] - lsf;
//			if (op < pist) {
//				op = pist;
//			}
//		}
//		return op;

		int max_profit = Integer.MIN_VALUE;
		int buy_price = Integer.MAX_VALUE;

		for (int i = 0; i <= prices.length - 1; i++) {
			if (prices[i] < buy_price) {
				buy_price = prices[i];
			}
			int diff = prices[i] - buy_price;
			if (diff > max_profit)
				max_profit = diff;
		}

		return max_profit;
	}

	public static void main(String[] args) {

		System.out.println(maxProfit(new int[] { 7, 1, 5, 3, 6, 4 }));
		System.out.println(maxProfit(new int[] { 7, 6, 4, 3, 1 }));
		System.out.println(maxProfit(new int[] { 2, 4, 1 }));

	}

}
