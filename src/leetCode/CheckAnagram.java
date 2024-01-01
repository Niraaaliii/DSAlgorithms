package leetCode;
import java.util.*;

public class CheckAnagram {

	static boolean isAnagram(String s, String t) {
		
		if((s.length() != t.length()) || (s.length() < 0 || t.length() < 0)) return false;
							
		HashMap<Character,Integer> sMap = new HashMap<Character,Integer>();
		HashMap<Character,Integer> tMap = new HashMap<Character,Integer>();
		
		//populate frequency of character
		for(char c : s.toCharArray() ) {
			sMap.put(c, sMap.getOrDefault(c, 0) + 1);
		}
		
		for(char x : t.toCharArray()) {
			tMap.put(x, tMap.getOrDefault(x, 0) + 1);
		}
		
		if(sMap.equals(tMap)) {
			return true;
		}
		else {
			return false; 
		}
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("rat", "tar"));
	}
}
