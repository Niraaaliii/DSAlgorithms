package leetCode;

import java.util.*;

public class ContainsDuplicate {

	static boolean containsDuplicate(int[] nums) {

//		HashMap<Integer, Integer> seen = new HashMap<>();
//		
//		for (int num : nums) {
//			
//			if (seen.containsKey(num) && seen.get(num) >= 1)
//				return true;
//			
//			seen.put(num, seen.getOrDefault(num, 0) + 1);
//		}
//		return false;
		
		HashSet<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num))
                return true;
            seen.add(num);
        }
        return false;
	}
	
	

	public static void main(String[] args) {

		System.out.println(containsDuplicate(new int[] { 1, 2, 3 , 1}));

	}

}
