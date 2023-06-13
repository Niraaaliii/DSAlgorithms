package takeUforward;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {

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
		input.close();

		sortArray(array);
		System.out.println("Sorted Array:");
		System.out.println(Arrays.toString(array));

	}
	
	public static void sortArray(int[] array){
		
		for (int i = 0; i < array.length - 1; i++) {
			
            int x = i;
            
            for (int j = i + 1; j < array.length; j++) {
            	
                if (array[j] < array[x]) {
                	
                    x = j;
                }
            }
            
            int temp = array[x];
            array[x] = array[i];
            array[i] = temp;
        }
        
	}

}
