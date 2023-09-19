package leetCode.LeetCode75;

import java.util.ArrayList;
import java.util.List;

public class KidsWithCandies {

	public static void main(String[] args) {
		
//		Input: candies = [2,3,5,1,3], extraCandies = 3
//				Output: [true,true,true,false,true] 
		
		List<Boolean> result = kidsWithCandies(new int[] {2,3,5,1,3}, 3);
		for (Boolean boolean1 : result) {
			System.out.println(boolean1);
		}
	}

	static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

		List<Boolean> result = new ArrayList<>();
		int max = 0;
		
		for(int i: candies) {
			
			if(i > max) {
				max = i;
			}
			
			if(i + extraCandies >= max) {
				result.add(true);
			}
			else {
				result.add(false);
			}
		}
		
		return result;
	}
}
