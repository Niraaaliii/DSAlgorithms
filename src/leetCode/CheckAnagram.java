package leetCode;
import java.util.*;

public class CheckAnagram {

	static boolean isAnagram(String s, String t) {
		
		if((s.length() != t.length()) || (s.length() < 0 || t.length() < 0)) return false;
							
		HashMap<Character,Integer> smap=new HashMap<>();
        
        for(int i=0;i<s.length();i++){
        	
            smap.put(s.charAt(i),smap.getOrDefault(s.charAt(i),0)+1);
            smap.put(t.charAt(i),smap.getOrDefault(t.charAt(i),0)-1);
        }
        
        for(char c:smap.keySet())
            if(smap.get(c)!=0) 
            	return false;
        
        
        return true;
		
	}

	public static void main(String[] args) {
		System.out.println(isAnagram("aacc", "ccac"));
	}
}
