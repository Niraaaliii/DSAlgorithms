package hackerRank;

import java.util.*;

public class ReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sizeOfarr = sc.nextInt();
		List<Integer> arr = new ArrayList<Integer>();
		for(int i=0;i<sizeOfarr;i++) {
			arr.add(sc.nextInt());
		}
		List<Integer> result = reverseArray(arr);
		System.out.println(result);
	}

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer> result = new ArrayList<Integer>();
    int n = a.size();
    for (int i = n - 1; i >= 0; i--) {
        result.add(a.get(i));
    }
    return result; 
    }

}
