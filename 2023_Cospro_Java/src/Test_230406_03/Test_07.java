package Test_230406_03;

class Solution {
	public int solution(int value, String unit) {
		int converted = 0;
		
		if(unit.equals("C")) {
			converted = (int)(value * 1.8) + 32;
		}
		
		else if(unit.equals("F")) {
			converted = (int)((980 - 32) / 1.8);
		}
		
		return converted;
	}
}

public class Test_07 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int value = 527;
		String unit = "C";
		int ret = sol.solution(value, unit);
		
		System.out.println(ret);

	}

}
