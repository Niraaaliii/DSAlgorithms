package neetcode;

import java.util.*;

//Example 1:
//
//Input: stones = [2,7,4,1,8,1]
//Output: 1
//Explanation: 
//We combine 7 and 8 to get 1 so the array converts to [2,4,1,1,1] then,
//we combine 2 and 4 to get 2 so the array converts to [2,1,1,1] then,
//we combine 2 and 1 to get 1 so the array converts to [1,1,1] then,
//we combine 1 and 1 to get 0 so the array converts to [1] then that's the value of the last stone.

//Example 2:
//
//Input: stones = [1]
//Output: 1

public class SmashingStones {

	static int lastStoneWeight(int[] stones) {

		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int st: stones) pq.add(st);
        while(pq.size() > 1) {
            int stone1 = pq.poll();
            int stone2 = pq.poll();
            if(stone1 > stone2) pq.add(stone1-stone2);
        }
        return pq.isEmpty() ? 0 : pq.peek();
	}

	public static void main(String[] args) {
		System.out.println(lastStoneWeight(new int[] { 2, 7, 4, 1, 8, 1 }));
//		System.out.println(lastStoneWeight(new int[] { 3, 7, 8 }));
//		System.out.println(lastStoneWeight(new int[] { 9, 3, 2, 10 }));
	}

}
