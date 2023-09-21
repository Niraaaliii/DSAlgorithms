package leetCode.LeetCode75;

public class MoveZeros {

	public static void main(String[] args) {
//		Example 1:
//
//			Input: nums = [0,1,0,3,12]
//			Output: [1,3,12,0,0]

		int[] arr = { 0, 1, 0, 3, 12 };
		moveZeroes(arr);
		for (int i : arr) {
			System.out.println(i);
		}

	}

	static void moveZeroes(int[] nums) {

		int insertPos = 0;
	    for (int num: nums) {
	        if (num != 0) nums[insertPos++] = num;
	    }        

	    while (insertPos < nums.length) {
	        nums[insertPos++] = 0;
	    }
	}
}
