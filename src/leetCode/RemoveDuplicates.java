package leetCode;

public class RemoveDuplicates {

	public static void main(String[] args) {
		/*
		 * Input: nums = [1,1,2] Output: 2, nums = [1,2,_] Explanation: Your function
		 * should return k = 2, with the first two elements of nums being 1 and 2
		 * respectively. It does not matter what you leave beyond the returned k (hence
		 * they are underscores).
		 */

		int[] nums = { 1, 1, 2 };
		System.out.println(removeDuplicates(nums));

		for (int i : nums) {
			System.out.print(i + " ");
		}
	}

	static int removeDuplicates(int[] nums) {

		int j = 1;
		for (int i = 1; i <= nums.length - 1; i++) {

			if (nums[i] != nums[i-1]) {
				nums[j] = nums[i];
				j++;
			}

		}
		return j;
	}
}
