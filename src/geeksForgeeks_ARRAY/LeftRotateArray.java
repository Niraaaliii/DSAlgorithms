package geeksForgeeks_ARRAY;

public class LeftRotateArray {

	public static void LeftRotateUsingTMPArray(int[] arr,int d,int len) {
		
//		Time complexity: O(N) 
//		Auxiliary Space: O(N)
		
		int[] tmp = new int[len];
		int j = 0;
		
		for(int i = d; i < len;i++) {
			tmp[j] = arr[i];
			j++;
		}
		
		for(int i = 0; i< d;i++) {
			tmp[j] = arr[i];
			j++;
		}
		
		for(int i = 0; i< len ; i++) {
			arr[i] = tmp[i];
		}
		for (int i = 0; i <= len - 1; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
	
	
	public static void LeftRotate(int[] arr, int c, int len) {

//		Time Complexity: O(N * d)
//		Auxiliary Space: O(1)
		
		int counter = 1;

		while (counter <= c) {

			int last = arr[0];
			for (int i = 0; i < len - 1; i++) {
				arr[i] = arr[i + 1];
			}

			arr[len - 1] = last;
			counter++;
		}

		for (int i = 0; i <= len - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5 };
		int c = 2;
		int len = arr.length;

		//LeftRotate(arr, c, len);
		//LeftRotateUsingTMPArray(arr, c, len);
	}

}
