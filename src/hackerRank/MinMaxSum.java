package hackerRank;

import java.util.*;


public class MinMaxSum {
	
	public static void miniMaxSum(List<Integer> arr) {
	    // Write your code here
	    int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
	    for(int i = 0; i<3; i++){
	        int sum=0;
	        for(int j= i +1; j<=4; j++){
	            sum += arr.get(j);
	        }
	        if(sum > max) max=sum;
	        else if(sum < min) min = sum;
	    }    
	    System.out.println(min + " " + max);
	    }

	public static void main(String[] args) {
		
		List<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(3);
		a.add(5);
		a.add(7);
		a.add(9);
		
		miniMaxSum(a);

	}

}
