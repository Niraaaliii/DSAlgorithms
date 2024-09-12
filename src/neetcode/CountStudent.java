package neetcode;
import java.util.*;

/*Example 1:

Input: students = [1,1,0,0], sandwiches = [0,1,0,1]
Output: 0 
Explanation:
- Front student leaves the top sandwich and returns to the end of the line making students = [1,0,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,0,1,1].
- Front student takes the top sandwich and leaves the line making students = [0,1,1] and sandwiches = [1,0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [1,1,0].
- Front student takes the top sandwich and leaves the line making students = [1,0] and sandwiches = [0,1].
- Front student leaves the top sandwich and returns to the end of the line making students = [0,1].
- Front student takes the top sandwich and leaves the line making students = [1] and sandwiches = [1].
- Front student takes the top sandwich and leaves the line making students = [] and sandwiches = [].
Hence all students are able to eat.*/

public class CountStudent {

	public static void main(String[] args) {
		System.out.println(countStudents(new int[] {1,1,0,0}, new int[] {0,1,0,1}));

	}

	static int countStudents(int[] students, int[] sandwiches) {
		
		Queue<Integer> sw = new LinkedList<Integer>();
//		
//		for(int i : sandwiches) {
//			sw.add(i);
//		}
		
		for(int i =0 ;i<=students.length;i++) {
			if(students[i] == sandwiches[i] )
			{
				sw.add(students[i]);
			}
		}
		
		return 0;
	}
}
