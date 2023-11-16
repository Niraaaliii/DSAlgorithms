package geeksForgeeks_ARRAY;

public class SortedArrayOP {

	static int Binarysearch(int[] arr, int low, int high, int val) {

		if (low > high) {
			return -1;
		}

		int mid = low + (low + high) / 2;

		if (arr[mid] == val) {
			return mid;
		} else if (arr[mid] > val) {
			return Binarysearch(arr, low, mid - 1, val);
		} else {
			return Binarysearch(arr, mid + 1, high, val);
		}

	}

	static void Selectionsort(int arr[], int len) {

		// do it by finding minimum value
		for (int i = 0; i < len - 1; i++) {
			int minINDX = i;

			for (int j = i + 1; j < len; j++) {
				if (arr[j] < arr[minINDX]) {
					minINDX = j;
				}
			}

			int tmp = arr[minINDX];
			arr[minINDX] = arr[i];
			arr[i] = tmp;
		}

		print(arr, len);
	}

	static void print(int arr[], int len) {

		for (int i = 0; i < len; i++) {
			System.out.print(i +"["+ arr[i] + "]"+ " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4, 1, 5 };
		int len = arr.length;

		//System.out.println(Binarysearch(arr, 0,len-1,3));
		print(arr, len);
		Selectionsort(arr, len);
		System.out.println(Binarysearch(arr, 0,len-1,3));
		//print(arr, len);

	}

}
