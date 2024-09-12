package leetCode.LeetCode75;

public class CountingBits {

	public static void main(String[] args) {

		int[] ans = countBits(5);
		for (int i : ans) {
			System.out.println(i);
		}
	}

	public static int[] countBits(int n) {

		int[] ans = new int[n + 1];
		
        for (int i = 1; i <= n; i++) {
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
	}
	
	

}
