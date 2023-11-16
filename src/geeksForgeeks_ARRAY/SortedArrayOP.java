package geeksForgeeks_ARRAY;

public class SortedArrayOP {

	static void insert(int[] arr,int indx, int val, int len) {
		
		for (int i = len - 1; i >= indx; i--)
			arr[i + 1] = arr[i];
		arr[indx] = val;
		
		Selectionsort(arr, len);
	}
	
	static int Binarysearch(int[] arr, int low, int high, int val) {

		if (low > high) {
			return -1;
		}

		int mid = (low + high) / 2;

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
			System.out.print( arr[i] +  " ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int[] arr = new int[6];
		arr[0] = 5;
		arr[1] = 2;
		arr[2] = 4;
		arr[3] = 1;

		int len = arr.length;

		//System.out.println(Binarysearch(arr, 0,len-1,3));
		Selectionsort(arr, len);
		int n = 5;
		
		System.out.println(n + " At indx: "+ Binarysearch(arr, 0,len-1,n));
		print(arr, len);
		
		insert(arr,0,3,len);
		print(arr, len);
		
		Selectionsort(arr, len);
		
	}

}
