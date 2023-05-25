package dsaAlgo;

import java.util.Arrays;

public class InsertionSort {

	static void insert(int[] array, int rightIndex, int value) {
	    int j = rightIndex;
	    while (j >= 0 && array[j] > value) {
	      array[j + 1] = array[j];
	      j--;
	    }
	    array[j + 1] = value;
	  }

	  public static void insertionSort(int[] array) {
	    for (int i = 1; i < array.length; i++) {
	      insert(array, i - 1, array[i]);
	    }
	  }

	public static void main(String[] args) {
		int[] array = { 2, 3, 9, 1, 8, 5 };
		insertionSort(array);
		System.out.println(Arrays.toString(array));
	}

}
