package neetcode_course;

public class StaticArrays {

    // Insert n into arr at the next open position.
    // Length is the number of 'real' values in arr, and capacity
    // is the size (aka memory allocated for the fixed size array).
    static void insertEnd(int[] arr, int n, int length, int capacity) {
        if (length < capacity) {
            arr[length] = n;
        }
    }    
            
    // Remove from the last position in the array if the array
    // is not empty (i.e. length is non-zero).
    static void removeEnd(int[] arr, int length) {
        if (length > 0) {
            // Overwrite last element with some default value.
            // We would also the length to decreased by 1.
            arr[length - 1] = 0;
            length--;
        }
    }        

    // Insert n into index i after shifting elements to the right.
    // Assuming i is a valid index and arr is not full.
    static void insertMiddle(int[] arr, int i, int n, int length) {
        // Shift starting from the end to i.
        for (int index = length - 1; index > i - 1; index--) {
            arr[index + 1] = arr[index];
        }
        //Insert at i
        arr[i] = n;
    }

    // Remove value at index i before shifting elements to the left.
    // Assuming i is a valid index.
    static void removeMiddle(int[] arr, int i, int length) {
        // Shift starting from i + 1 to end.
        for (int index = i + 1; index < length; index++) {
            arr[index - 1] = arr[index];
        } 
        // No need to 'remove' arr[i], since we already shifted
    }

    static void printArr(int[] arr, int length) {
        for (int i = 0; i < length; i++) {
            System.out.print(arr[i] + " ");
        }      
        System.out.println();
    }
    
    public static void main(String[] args) {
    	int[] arr = new int[5];
    	int len = arr.length;
    	arr[0] = 1;
    	arr[1] = 2;
    	arr[2] = 3;
    	arr[3] = 4;
    	printArr(arr, len);
    	insertEnd(arr, 5, 4, len);
    	printArr(arr, len);
    	insertEnd(arr, 6, 4, len);
    	printArr(arr, len);
    	removeEnd(arr, len);
    	printArr(arr, len);
    	insertMiddle(arr, 3, 5, 4);
    	printArr(arr, len);
    }
}    