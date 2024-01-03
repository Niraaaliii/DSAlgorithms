package neetcode;

import java.util.*;

//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//Example 1:
//
//Input: nums = [3,0,1]
//Output: 2
//Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.

public class MissingNumber {

	static int missingNumber(int[] nums) {

		int len = nums.length;
		HashSet<Integer> n = new HashSet<>();
		
		for (int i = 1; i <= nums.length; i++) {
			n.add(i);
		}
		
		///for(int )
		return 0;
	}

	public static void main(String[] args) {

		System.out.println(missingNumber(new int[] { 3, 0, 1 }));

	}

}
