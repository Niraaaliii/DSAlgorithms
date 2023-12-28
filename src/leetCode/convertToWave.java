package leetCode;

public class convertToWave {

	static void convertToW(int n, int[] a) {
       
		for(int i =0;i<a.length-1;i++) {
			if(i%2==0) {
				int tmp = a[i];
				a[i] = a[i+1];
				a[i+1] = tmp;
			}
		}
		
    }
	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		
		for(int i:arr) {
			System.out.print(i+ " ");
		}
		
		convertToW(5, arr );
		System.out.println(" ");
		for(int i:arr) {
			System.out.print(i+ " ");
		}
	}

}
