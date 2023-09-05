package leetCode;

public class RemoveElement {

	public static void main(String[] args) {

		/*
		 * Input: nums = [3,2,2,3], val = 3 Output: 2, nums = [2,2,_,_] Explanation:
		 * Your function should return k = 2, with the first two elements of nums being
		 * 2. It does not matter what you leave beyond the returned k (hence they are
		 * underscores).
		 */

		int[] nums = { 3, 2, 2, 3 };
		int val = 3;

		System.out.println(removeElement(nums, val));

		for (int i : nums) {
			System.out.print(i + " ");
		}

	}

	static int removeElement(int[] nums, int val) {

		int c = 0;
		for (int i = 0; i <= nums.length - 1; i++) {

			if(nums[i] != val) {
				nums[c] = nums[i];
				c++;
			}
		}

		return c;
	}
}
