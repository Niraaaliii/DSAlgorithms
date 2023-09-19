package leetCode.LeetCode75;

public class ReverseStringVowel {

	public static void main(String[] args) {
//		Example 1:
//
//			Input: s = "hello"
//			Output: "holle"
//			Example 2:
//
//			Input: s = "leetcode"
//			Output: "leotcede"

		System.out.println(reverseVowels("hello"));
		System.out.println(reverseVowels("leetcode"));

	}

	static String reverseVowels(String s) {

		if (s == null || s.length() == 0)
			return s;

		String vowels = "aeiouAEIOU";
		char[] chars = s.toCharArray();
		int start = 0;
		int end = s.length() - 1;

		while (start < end) {
			// Move start pointer if not a vowel
			while (start < end && vowels.indexOf(chars[start]) == -1) {
				start++;
			}

			// Move end pointer if not a vowel
			while (start < end && vowels.indexOf(chars[end]) == -1) {
				end--;
			}

			// Swap characters at start and end pointers
			char temp = chars[start];
			chars[start] = chars[end];
			chars[end] = temp;

			start++;
			end--;
		}

		return new String(chars);
	}

}
