package leetCode;

import java.util.Stack;

//Example 1:
//
//Input: ops = ["5","2","C","D","+"]
//Output: 30
//Explanation:
//"5" - Add 5 to the record, record is now [5].
//"2" - Add 2 to the record, record is now [5, 2].
//"C" - Invalidate and remove the previous score, record is now [5].
//"D" - Add 2 * 5 = 10 to the record, record is now [5, 10].
//"+" - Add 5 + 10 = 15 to the record, record is now [5, 10, 15].
//The total sum is 5 + 10 + 15 = 30.

public class BaseballGame {

	static int calPoints(String[] operations) {

		 Stack<Integer> stack = new Stack<>();

	        for (String s : operations) {
	        	
	            if (s.equals("+")) {
	                int a = stack.pop();
	                int newScore = a + stack.peek();
	                stack.push(a);
	                stack.push(newScore);
	            	
	            }
	            
	            else if (s.equals("D")) {
	                stack.push(2 * stack.peek());
	            }
	            
	            else if (s.equals("C")) {
	                stack.pop();
	            }
	            
	            else stack.push(Integer.parseInt(s));
	            
	            System.out.print("Stack : ");
	            for(int i : stack) {
	            	System.out.print( i + " ");
	            }
	            System.out.println(" ");
	        }

	        int totalScore = 0;
	        while (!stack.isEmpty()) totalScore += stack.pop();

	        return totalScore;
	    
	}

	public static void main(String[] args) {
		
		String[] ops = {"5","2","C","D","+"};
		System.out.println("Total :" + calPoints(ops));
	}

}
