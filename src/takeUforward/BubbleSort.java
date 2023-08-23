package takeUforward;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
	
    public static void main(String args[]) {
    	Scanner input = new Scanner(System.in);
		System.out.println("How many numbers do you want to enter?");
		int num = input.nextInt();

		int array[] = new int[num];

		System.out.println("Enter the " + num + " numbers now.");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		
		System.out.println();
		System.out.println("These are the numbers you have entered.");
		System.out.println(Arrays.toString(array));
		input.close();
		
        System.out.println();
        bubbleSort(array, num);
    }
    
    static void bubbleSort(int[] arr, int n) {
    	
        for (int i = n - 1; i >= 0; i--) {
        	
            for (int j = 0; j <= i - 1; j++) {
            	
                if (arr[j] > arr[j + 1]) {
                	
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After bubble sort: ");
        System.out.println(Arrays.toString(arr));
    }
}
