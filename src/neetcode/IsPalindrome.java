package neetcode;

//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.

public class IsPalindrome {

	static boolean isPalindrome(String s) {

		String filteredString = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
		//System.out.println(filteredString);

		int left = 0;
		int right = filteredString.length() - 1;

		while (left < right) {
			if (filteredString.charAt(left) != filteredString.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}

}
