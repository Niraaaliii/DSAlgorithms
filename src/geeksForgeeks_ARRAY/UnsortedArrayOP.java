package geeksForgeeks_ARRAY;

public class UnsortedArrayOP {

	static void printElements(int[] arr, int len) {

		for (int i = 0; i < len; i++) {
			System.out.print(arr[i] + " ");
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

	static void deleteElement(int arr[], int n, int key) {

		int pos = findIndxofElement(arr, n, key);

		if (pos == -1) {
			System.out.println("Element not found");
			return;
		}

		for (int i = pos; i < n - 1; i++)
			arr[i] = arr[i + 1];

		printElements(arr, n-1);
	}

	static void insertElement(int arr[], int len, int val, int pos) {
		for (int i = len - 1; i >= pos; i--)
			arr[i + 1] = arr[i];
		arr[pos] = val;
		printElements(arr, len + 1);
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
		int pos = 1;

		printElements(arr, len);

		insertElement(arr, len, val, pos);
		len += 1;
		
		val = 1;
		deleteElement(arr, len, val);
	}

}
