package neetcode;
import java.util.*;

public class MinStack {
	
	Stack<Integer> stack = new Stack<>(); //Store all values
	Stack<Integer> minStack = new Stack<>(); //Minimum value for each insertion
   
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(minStack.isEmpty() || val < minStack.peek()){
            minStack.add(val);
        }else{
            minStack.add(minStack.peek());
        }
        stack.add(val);
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }

	public static void main(String[] args) {
		MinStack obj = new MinStack();
		obj.push(-2);
		
		System.out.println("Added -2 ");
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		System.out.println(" Top element :" + param_3);
		System.out.println(" Min element :" + param_4);
		
		
		obj.push(0);
		
		System.out.println("Added 0 ");
		param_3 = obj.top();
		param_4 = obj.getMin();
		System.out.println(" Top element :" + param_3);
		System.out.println(" Min element :" + param_4);
		
		obj.push(-3);
		
		System.out.println("Added -3 ");
		param_3 = obj.top();
		param_4 = obj.getMin();
		System.out.println(" Top element :" + param_3);
		System.out.println(" Min element :" + param_4);
		
		obj.pop();
		
		System.out.println("Popped");
		param_3 = obj.top();
		param_4 = obj.getMin();
		System.out.println(" Top element :" + param_3);
		System.out.println(" Min element :" + param_4);
		
		
	}

}
