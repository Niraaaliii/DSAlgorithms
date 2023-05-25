package dsaAlgo;

import java.util.Arrays;
import java.util.Scanner;

public class InsertaValue {

	public static void insert(int[] array, int rightIndex, int value) {
		
		 int i = rightIndex;

		    // Shift elements to the right to make room for the value
		    while (i >= 0 && array[i] > value) {
		        array[i + 1] = array[i];
		        i--;
		    }

		    // Insert the value at the correct position
		    array[i + 1] = value;
	    
		
	  }
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers do you want to enter?");
		int num = input.nextInt();

		int array[] = new int[num];

		System.out.println("Enter the " + num + " numbers now.");

		for (int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}

		System.out.println("These are the numbers you have entered.");
		System.out.println(Arrays.toString(array));
		
		System.out.println("Enter the right index.");
		int ri = input.nextInt();
		
		System.out.println("Enter the value for "+ ri +" index.");
		int val = input.nextInt();

		input.close();
		
		insert(array,ri,val);
//		int array[] = {2,3,5,7,11,13,9,6};
//		insert(array,5,9);
		System.out.println(Arrays.toString(array));
	}

}
