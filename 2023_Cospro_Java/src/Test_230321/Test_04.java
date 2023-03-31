package Test_230321;
import java.util.*;

class Solution {
	public int func_a(int month, int day) {
		int monthList[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int total = 0;
		for(int i = 0; i <= month - 1; i++) 
			total += monthList[i];
			total += day;
		
		return total -1;
		}

public int solution(int startMonth, int startDay, int endMonth, int endDay) {
	int startTotal = func_a(startMonth, startDay);
	int endTotal = func_a(endMonth, endDay);
	
	return endTotal - startTotal;
}

public class Test_04 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int startMonth = 1;
		int startDay = 2;
		int endMonth = 2;
		int endDay = 2;
		int ret = sol.solution(startMonth, startDay, endMonth, endDay);
		
		System.out.println("Solution : return value of the method is "+ret+".");

		}
	}
}
