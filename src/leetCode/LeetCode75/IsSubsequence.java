package leetCode.LeetCode75;

public class IsSubsequence {

	public static void main(String[] args) {

//		Example 1:
//			Input: s = "abc", t = "ahbgdc"
//			Output: true
//		Example 2:
//			Input: s = "axc", t = "ahbgdc"
//			Output: false

		System.out.println(isSubsequence("abc", "ahbgdc"));
		System.out.println(isSubsequence("axc", "ahbgdc"));

	}

	static boolean isSubsequence(String s, String t) {
		int i = 0;
		for (int j = 0; j < t.length() && i < s.length(); j++)
			if (t.charAt(j) == s.charAt(i))
				i++;
		return i == s.length();
	}
}
