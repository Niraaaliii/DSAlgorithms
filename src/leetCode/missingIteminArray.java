package leetCode;

import java.util.*;

public class missingIteminArray {

	static int missingNumber(int array[], int n) {
        	
		int t = n*(n+1)/2;
		int r= 0;
		
		for(int i:array) {
			r += i;
		}
		
		return t - r;
    }

	public static void main(String[] args) {
		int[] arr = {1,2,3,5};
	    System.out.println(missingNumber(arr,5));

	}

}
