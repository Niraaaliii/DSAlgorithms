package hackerRank;

import java.util.*;

public class OneWEEKPREP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		List<List<Integer>> arr = new ArrayList<>();
//
//        List<Integer> row1 = Arrays.asList(1, 2, 3);
//        arr.add(row1);
//
//        List<Integer> row2 = Arrays.asList(4, 5, 6);
//        arr.add(row2);
//
//        List<Integer> row3 = Arrays.asList(9, 8, 9);
//        arr.add(row3);
//
//        //System.out.println(diagonalDifference(arr));
//        
//        List<Integer> count = Arrays.asList(1,1,3,2,1);
//        count = countingSort(count);
//        for(int i : count)
//        	System.out.print(i + " ");

		List<Integer> candles = Arrays.asList(4, 4, 1, 3);
		System.out.println(birthdayCakeCandles(candles));

	}

	public static int birthdayCakeCandles(List<Integer> candles) {
		// Write your code here
		int maxHeight = Integer.MIN_VALUE;
		int maxHeightCount = 0;

		for (int height : candles) {
			if (height > maxHeight) {
				maxHeight = height;
				maxHeightCount = 1;
			} else if (height == maxHeight) {
				maxHeightCount++;
			}
		}

		return maxHeightCount;
	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		int n = arr.size();
		int primaryDiagonalSum = 0;
		int secondaryDiagonalSum = 0;

		// Calculate the sum of elements along the primary and secondary diagonals
		for (int i = 0; i < n; i++) {
			primaryDiagonalSum += arr.get(i).get(i);
			secondaryDiagonalSum += arr.get(i).get(n - 1 - i);
		}

		// Calculate the absolute difference between the two diagonal sums
		int absoluteDifference = Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
		return absoluteDifference;
	}

	public static List<Integer> countingSort(List<Integer> arr) {
		// Write your code here
		int[] frequency = new int[arr.size() - 1];

		// Count the occurrences of each value in the input array
		for (int num : arr) {
			frequency[num]++;
		}

		// Convert the frequency array to a list
		List<Integer> result = new ArrayList<>();
		for (int count : frequency) {
			result.add(count);
		}

		return result;
	}

}
