package leetCode.LeetCode75;

public class MergeString {

	public static void main(String[] args) {
		System.out.println(mergeAlternately("abc", "def"));
		// System.out.println(mergeAlternately("ab", "def"));
		// System.out.println(mergeAlternately("abc", "de"));
	}

	static String mergeAlternately(String word1, String word2) {

		if (word1.length() <= 1 || word2.length() <= 1 || word1.length() >= 100 || word1.length() >= 100) {
			return null;
		}

		word1 = word1.toLowerCase();
		word2 = word2.toLowerCase();

		StringBuilder merged = new StringBuilder();
		int maxLength = Math.max(word1.length(), word2.length());

		for (int i = 0; i < maxLength; i++) {
			if (i < word1.length()) {
				merged.append(word1.charAt(i));
			}

			if (i < word2.length()) {
				merged.append(word2.charAt(i));
			}
		}

		return merged.toString();
	}
}
