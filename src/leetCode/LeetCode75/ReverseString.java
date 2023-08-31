package leetCode.LeetCode75;


public class ReverseString {

	public static void main(String[] args) {
		
		System.out.println(reverseWords("Sky is  Blue"));
			
	}

	static String reverseWords(String s) {
		   
        String[] temp = s.trim().split("\\s+");
        
        String result = "";
 
        for (int i = temp.length-1; i > 0; i--) {
                result += temp[i] + " ";
        }
        
        return result + temp[0];
	}
}
