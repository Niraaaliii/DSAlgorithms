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

		int range = nums.length;
		int expected_sum = (range * (range + 1) )/ 2;
		int actual = 0;
		
		for(int i : nums) {
			actual += i;
		}
		
		return expected_sum-actual;
	}

	public static void main(String[] args) {

		System.out.println(missingNumber(new int[] { 3, 0, 1 }));

	}

}
