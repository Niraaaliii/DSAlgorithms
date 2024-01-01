package neetcode;
import java.util.*;

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSum {

	static int[] twoSum(int[] nums, int target) {
		
		HashMap<Integer,Integer> map = new HashMap<>();
		
		for(int i = 0;i<nums.length;i++) {
			map.put(nums[i], i);
		}

		for(int i = 0;i<nums.length;i++) {
			int complement = target - nums[i];
			if(map.containsKey(complement) && map.get(complement) != i) {
				return new int[]{i, map.get(complement)};
			}
		}
		
		return new int[] {}; 
	}

	public static void main(String[] args) {

		int[] n = { 2, 4, 11, 3 };
		int target = 6;

		int[] ans = twoSum(n, target);

		for (int i : ans) {
			System.out.print(i + " ");
		}

	}

}
