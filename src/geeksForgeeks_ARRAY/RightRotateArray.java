package geeksForgeeks_ARRAY;

public class RightRotateArray {

	public static void RightRotate(int[] arr, int c, int len) {

//		Time Complexity: O(N * d)
//		Auxiliary Space: O(1)
		
		int counter = 1;
		while (counter <= c) {
			int first = arr[len - 1];
			for (int i = len - 1; i > 0; i--) {
				arr[i] = arr[i - 1];
			}
			arr[0] = first;
			counter++;
		}

		for (int i = 0; i <= len - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String args[]) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int c = 2;
		int len = arr.length;

		RightRotate(arr, c, len);
	}

}
