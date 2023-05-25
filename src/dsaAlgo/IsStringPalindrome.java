package dsaAlgo;

public class IsStringPalindrome {

	public static Boolean isPalindrome(String str) {
		int strLen = str.length();
		if (strLen == 1) {
			return true;
		}

		if (str.substring(0, 1) != str.substring(strLen - 1)) {
			return false;
		}
		
		//isPalindrome(str.substring(1, strLen - 1));
		String remaining = str.substring(1, strLen - 1);
        return isPalindrome(remaining);

	}

	public static void main(String[] args) {
		//isPalindrome("Hello");
		System.out.println(isPalindrome("deed"));
	}

}
