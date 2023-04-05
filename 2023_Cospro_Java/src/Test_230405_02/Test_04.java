package Test_230405_02;
import java.util.*;

class Solution {
	public String solution(String[] words) {
		String answer = "";
		
		for(int i = 0; i < words.length; i++) {
			if(5 <= words[i].length()) 
				answer += words[i];
		}
			if(answer == "")
				answer = "empty";
		
		
		return answer;
	}
}

public class Test_04 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] words1 = {"my", "favorite", "color", "is", "violet"};
		String ret1 = sol.solution(words1);
		
		System.out.println(ret1);
		
		String[] words2 = {"yes", "i", "am"};
		String ret2 = sol.solution(words2);
		
		System.out.println(ret2);
	}

}
