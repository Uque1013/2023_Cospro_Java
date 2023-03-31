package Test_230330;

class Solution {
	public String solution(String characters) {
		String result = "";
		result += characters.charAt(0);
		for(int i = 0; i < characters.length()-1; i++) {
			if(characters.charAt(i) != characters.charAt(i+1))
				result += characters.charAt(i+1);
		} // for
		return result;
	} // solution
} // class


public class Test_09 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String characters = "senteeeenccccccceeee";
		String ret = sol.solution(characters);
		
		System.out.println(ret);

	}

}
