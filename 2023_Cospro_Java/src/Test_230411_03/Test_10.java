package Test_230411_03;
import java.util.*;

class Solution{
	public int solution(int[] purchase) {
		int total = 0;
		
		for(int i = 0; i < purchase.length; i++) {
			if(purchase[i] >= 1000000) total += 50000;
			else if(purchase[i] >= 600000) total += 30000;
			else if(purchase[i] >= 400000) total += 20000;
			else if(purchase[i] >= 200000) total += 10000;
		}
		
		return total;
	}
}

public class Test_10 {

	public static void main(String[] args) {
		Solution sol = new Solution();
        int[] purchase = {150000, 210000, 399990, 990000, 1000000};
        int ret = sol.solution(purchase);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}
