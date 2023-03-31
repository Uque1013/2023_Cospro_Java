package Test_230323_02;
import java.util.*;

class Solution {
	public int solution(int number) {
		int count = 0;
		for(int i = 1; i <= number; i++) {
			int current = i;

			while(current != 0) {
				if(current % 10 == 3 || current % 10 == 6 || current % 10 == 9) {
					count++;
					System.out.println("pair");
				} // if (while)
				current /= 10;
			} // while

		} // for
		System.out.println();
		return count;
	} // solution
} // class 


public class Test_06 {
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int number = 40;
		int ret = sol.solution(number);
		
		System.out.println(ret);
	}
}

