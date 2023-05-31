package hackerRank;
import java.io.*;
import java.util.*;

public class DiagonalDifference {

	public static void main(String[] args) throws IOException {
		
		List<List<Integer>> arr = new ArrayList<>();
	    arr.add(Arrays.asList(11, 2, 4));
	    arr.add(Arrays.asList(4, 5, 6));
	    arr.add(Arrays.asList(10, 8, -12));
	    
        int result = diagonalDifference(arr);
        System.out.println(result);
	}
	
	public static int diagonalDifference(List<List<Integer>> arr) {
	    int n = arr.size();
	    int primarySum = 0;
	    int secondarySum = 0;

	    for (int i = 0; i < n; i++) {
	        primarySum += arr.get(i).get(i);
	    }

	    for (int i = 0; i < n; i++) {
	        secondarySum += arr.get(i).get(n - i - 1);
	    }

	    return Math.abs(primarySum - secondarySum);
	    }
}