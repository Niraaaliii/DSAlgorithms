package dsaAlgo;

import java.util.Arrays;
import java.util.Scanner;

class SelectionSort {

	public static void swap(int[] array, int firstIndex, int secondIndex) {
		int temp = array[firstIndex];
		array[firstIndex] = array[secondIndex];
		array[secondIndex] = temp;
		return;
	}

	public static void selectionSort(int[] array) {
		int n = array.length;

		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (array[j] < array[min_idx])
					min_idx = j;

			swap(array, min_idx, i);
		}
		return;
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
		input.close();

		selectionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
