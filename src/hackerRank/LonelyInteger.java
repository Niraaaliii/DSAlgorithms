package hackerRank;

import java.util.*;

public class LonelyInteger {

	public static int lonelyinteger(List<Integer> a) {

		HashMap<Integer, Integer> ints = new HashMap<>();
		
		for (int num : a) {
			ints.put(num, ints.getOrDefault(num, 0) + 1);
		}
		
		for (int key : ints.keySet()) {
			if (ints.get(key) == 1) {
				return key;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {

		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(2);
		a.add(5);
		a.add(2);
		a.add(1);

		System.out.println(lonelyinteger(a));
	}

}
