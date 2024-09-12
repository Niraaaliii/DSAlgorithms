package dsaAlgo;

public class AllSorting_Searching {

	public static void main(String[] args) {
		//int[] a = {5,2,3,4,1};
		int[] b = {1,2,3,4,5};
		System.out.println( BinarySearching(b, 5));
	}
	
	public static int BinarySearching(int[] a, int x) {
		int l = 0;
		int r = a.length -1;
		
		while( l < r){
			int mid = l + ( r-l ) /2;
			if(a[mid] == x) return mid;
			if(a[mid] <= x) l = mid + 1;
			else r = mid - 1;
		}
	
		return -1;
	}
}
