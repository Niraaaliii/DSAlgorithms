package leetCode;

public class MergeTwoSortedArrays {

	public static void main(String[] args) {
		
		/*
		 * Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3 Output:
		 * [1,2,2,3,5,6]
		 */
		
		int[] nums1 = { 1, 2, 3, 0, 0, 0 };
		int[] nums2 = { 2, 5, 6 };

		merge(nums1, 3, nums2, 3);

		for (int i : nums1) {
			System.out.print(i + " ");
		}

	}

	static void merge(int[] nums1, int m, int[] nums2, int n) {

		
	}
}
