package neetcode;
import java.util.*;

public class TheAnagram {

	public static void main(String[] args) {
		
		String a = "abcb";
		String b = "bcab";
		
		System.out.println(isAnagram(a, b));
	}

	public static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) {
            return false;
        }

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();

        for (char c : a.toCharArray()) {
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }

        for (char c : b.toCharArray()) {
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }

        return mapA.equals(mapB);
    }
}
