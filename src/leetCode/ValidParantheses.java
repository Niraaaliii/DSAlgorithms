package leetCode;
import java.util.*;
/*
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Every close bracket has a corresponding open bracket of the same type.

Example 1:

Input: s = "()"
Output: true
Example 2:

Input: s = "(]"
Output: false
 */
public class ValidParantheses {

	static boolean isValid(String s) {
		
		Stack<String> parts = new Stack<>();
		
		for(char c : s.toCharArray()) {
			
		}
		
		return true;
	}

	public static void main(String[] args) {
		String a = "{}[]()";
		isValid(a);
	}

}
