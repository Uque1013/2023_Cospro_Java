package Test_230316;
import java.util.*;

class Solution{
	public int solution(int price, String grade) {
		
		int answer = 0;
		if(grade.equals("S"))
			answer = (int) (price*0.95);
		else if(grade.equals("G"))
			answer = (int) (price*0.9);
		else if(grade.equals("V"))
			answer = (int) (price*0.85);
		
		return answer;
	}
}

public class Test_03 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int price1 = 2500;
		String grade1 = new String("V");
		int ret1 = sol.solution(price1, grade1);
		
		System.out.println("Solution: return value of the method is "+ret1+".");
		
		int price2 = 96900;
		String grade2 = new String("S");
		int ret2 = sol.solution(price2, grade2);
		
		System.out.println("Solution: return value of the method is "+ret2+".");

	}

}
