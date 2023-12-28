package leetCode;

public class ConcateArray {

	static int[] getConcatenation(int[] nums) {

//	        int[] ans = new int[nums.length*2];
//	        for(int i = 0, j =0;i<=ans.length-1;i++,j++){
//	            if(i==nums.length) j=0;
//	            ans[i] = nums[j];   
//	        }
//	        return ans;

		int[] ans = new int[2 * nums.length];
		for (int i = 0; i < nums.length; i++) {
			ans[i] = ans[i + nums.length] = nums[i];
		}

		return ans;
	}

	public static void main(String[] args) {

		int[] ans = getConcatenation(new int[] { 1, 2, 1 });
		for (int i : ans) {
			System.out.print(i + " ");
		}
	}

}
