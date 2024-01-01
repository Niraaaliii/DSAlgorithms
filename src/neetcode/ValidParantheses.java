package neetcode;
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
		
		
//		Stack<Character> stk = new Stack<>();
//
//        for(char c : s.toCharArray()){
//            switch(c)
//            {
//                case '{':
//                	stk.push('}');
//                    break;
//                case '[':
//                	stk.push(']');
//                    break;
//                case '(':
//                    stk.push(')');
//                    break;
//                default: 
//                	if( stk.isEmpty() || stk.pop() != c )
//                	{
//                		return false;
//                	}
//            }
//        }
//        return stk.isEmpty();
		
		 Stack<Character> stack = new Stack<Character>(); 
	        for (char c : s.toCharArray()) { 
	            if (c == '(') 
	                stack.push(')'); 
	            else if (c == '{') 
	                stack.push('}'); 
	            else if (c == '[') 
	                stack.push(']'); 
	            else if (stack.isEmpty() || stack.pop() != c) 
	                return false;
	        }
	        return stack.isEmpty();
	}

	public static void main(String[] args) {
		String a = "{()";
		System.out.println(isValid(a));
	}
}
