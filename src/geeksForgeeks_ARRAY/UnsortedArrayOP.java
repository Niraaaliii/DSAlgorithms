package geeksForgeeks_ARRAY;

public class UnsortedArrayOP {

	static void printElements(int[] arr) {

		for (int i : arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	static int findIndxofElement(int arr[], int len, int val) {

		for (int i = 0; i < len; i++) {
			if (arr[i] == val) {
				return i;
			}
		}

		return -1;
	}

	static void deleteElement(int arr[],int len, int val) {
		
		int pos = findIndxofElement(arr, len, val);
		
		
		
	}

	static void insertElement(int arr[], int len, int val, int pos) {

		int tmp = arr[pos];
		arr[pos] = val;

		for (int i = pos + 1; i < len; i++) {
			arr[i] = tmp;
			tmp = arr[i + 1];
		}
		
		printElements(arr);

	}

	public static void main(String args[]) {
		int arr[] = new int[6];
		arr[0] = 2;
		arr[1] = 4;
		arr[2] = 1;
		arr[3] = 8;
		arr[4] = 5;

		int len = 5;
		int val = 10;
		int pos = 2;

		printElements(arr);
		
		insertElement(arr, len, val, pos);
	}

}
