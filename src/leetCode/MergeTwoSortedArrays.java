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

		int i = m - 1, j = n - 1, k = m + n - 1;
		
		while(j >= 0) {
			
			if(i >= 0 && nums1[i] > nums2[j]) {
				nums1[k--] = nums1[i--];
			}
			else {
				nums1[k--] = nums2[j--];
			}
		}
	}
}
