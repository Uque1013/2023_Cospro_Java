package Test_230329_02;
import java.util.*;

class Solution {
	boolean solution(String sentence) {
		String str = "";
		for(int i= 0; i < sentence.length(); i++) {
			char c = sentence.charAt(i);
			if(c != ' ' && c != '.' && c != ',')
				str += c;
		} // for
		int len = str.length();
		for(int i = 0; i < len/2; i++) {
			if(str.charAt(i) != str.charAt(str.length()-1-i))
				return false; 		// 하나라도 같지 않으면 false
		} // for
		return true;
	} // solution
} // class

public class Test_08 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String sentence1 = "never odd or even";
		boolean ret1 = sol.solution(sentence1);
		
		System.out.println(ret1);
		
		
		String sentence2 = "palindrome";
		boolean ret2 = sol.solution(sentence2);
		
		System.out.println(ret2);

	}

}
