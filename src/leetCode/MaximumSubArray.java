package leetCode;

import java.util.*;

public class MaximumSubArray {

	public static void main(String[] args) {

//		Input:
//			N = 9, K = 3
//			arr[] = 1 2 3 1 4 5 2 3 6
//		Output: 
//			3 3 4 5 5 5 6 
//		Explanation: 
//			1st contiguous subarray = {1 2 3} Max = 3
//			2nd contiguous subarray = {2 3 1} Max = 3
//			3rd contiguous subarray = {3 1 4} Max = 4
//			4th contiguous subarray = {1 4 5} Max = 5
//			5th contiguous subarray = {4 5 2} Max = 5
//			6th contiguous subarray = {5 2 3} Max = 5
//			7th contiguous subarray = {2 3 6} Max = 6

		int[] arr = { 1, 2, 3, 1, 4, 5, 2, 3, 6 };
		int n = 9, k = 3;

		ArrayList<Integer> ans = max_of_subarrays(arr, n, k);
//		max_of_subarrays(arr, n, k);
		
		for (int i : ans) {
			System.out.println(i);
		}

	}

	static ArrayList<Integer> max_of_subarrays(int arr[], int N, int K) {
		ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i <= N - K; i++) {
            int max = arr[i];
            for (int j = 1; j < K; j++) {
                if (arr[i + j] > max) {
                    max = arr[i + j];
                }
            }
            result.add(max);
        }

        return result;
	}
	
}

//import java.util.ArrayDeque;
//import java.util.Deque;
//import java.util.ArrayList;
//import java.util.List;
//
//public class MaximumSubarrays {
//
//    public static List<Integer> maxOfSubarrays(int[] arr, int N, int K) {
//        List<Integer> result = new ArrayList<>();
//        Deque<Integer> deque = new ArrayDeque<>();
//
//        // Process the first window separately
//        for (int i = 0; i < K; i++) {
//            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
//                deque.pollLast();
//            }
//            deque.offerLast(i);
//        }
//
//        // Process the remaining windows
//        for (int i = K; i < N; i++) {
//            result.add(arr[deque.peekFirst()]);
//
//            // Remove elements outside the current window
//            while (!deque.isEmpty() && deque.peekFirst() <= i - K) {
//                deque.pollFirst();
//            }
//
//            // Remove elements smaller than the current element from the back
//            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()]) {
//                deque.pollLast();
//            }
//
//            deque.offerLast(i);
//        }
//
//        // Append the maximum of the last window
//        result.add(arr[deque.peekFirst()]);
//
//        return result;
//    }
//
//    public static void main(String[] args) {
//        int[] arr1 = {1, 2, 3, 1, 4, 5, 2, 3, 6};
//        int N1 = 9, K1 = 3;
//        System.out.println(maxOfSubarrays(arr1, N1, K1));  // Output: [3, 3, 4, 5, 5, 5, 6]
//
//        int[] arr2 = {8, 5, 10, 7, 9, 4, 15, 12, 90, 13};
//        int N2 = 10, K2 = 4;
//        System.out.println(maxOfSubarrays(arr2, N2, K2));  // Output: [10, 10, 10, 15, 15, 90, 90]
//    }
//}
//
