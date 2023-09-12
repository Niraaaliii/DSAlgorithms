package leetCode;

import java.util.*;

public class MajorityElement {

	public static void main(String[] args) {

		/*
		 * Example 1: Input: nums = [3,2,3] Output: 3
		 * 
		 * Example 2: Input: nums = [2,2,1,1,1,2,2] Output: 2
		 */

		System.out.println(majorityElement(new int[] { 3, 2, 3 }));
	}

	static int majorityElement(int[] nums) {

		int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        n = n / 2;
        
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }
        
        return 0;
		
	}

}
