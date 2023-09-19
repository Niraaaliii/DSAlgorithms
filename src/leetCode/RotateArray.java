package leetCode;

public class RotateArray {

	public static void main(String[] args) {
		/*
		 * Example 1:
		 * 
		 * Input: nums = [1,2,3,4,5,6,7], k = 3 Output: [5,6,7,1,2,3,4] Explanation:
		 * rotate 1 steps to the right: [7,1,2,3,4,5,6] rotate 2 steps to the right:
		 * [6,7,1,2,3,4,5] rotate 3 steps to the right: [5,6,7,1,2,3,4] Example 2:
		 * 
		 * Input: nums = [-1,-100,3,99], k = 2 Output: [3,99,-1,-100] Explanation:
		 * rotate 1 steps to the right: [99,-1,-100,3] rotate 2 steps to the right:
		 * [3,99,-1,-100]
		 */

		int[] nums = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(nums, 3);
		for (int val : nums) {
			System.out.print(val + " ");
		}

	}

	static void rotate(int[] nums, int k) {

		int count = 0;
		for (int i = nums.length - 1; i > 0; i--) {
			if (count < k) {
				int tmp = nums[count];
				nums[count] = nums[i];
				nums[i] = tmp;
				count++;
			}
		}
	}
}
