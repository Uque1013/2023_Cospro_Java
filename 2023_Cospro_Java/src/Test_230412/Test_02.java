package Test_230412;
import java.util.*;

class Solution {
	public int func_a(int[] currentGrade, int[] lastGrade, int[] rank, int maxDiffGrade) {
		int arrLength = currentGrade.length;
		int count = 0;
		for(int i = 0; i <arrLength; i++) {
			if(currentGrade[i] >= 80 && rank[i] == 1)
				count ++;
			else if(maxDiffGrade == currentGrade[i] - lastGrade[i])
				count ++;
		}
		return count;
	} // func_a
	
	public int[] func_b(int[] currentGrade) {
		int arrLength = currentGrade.length;
		int[] rank = new int[arrLength];
		for(int i = 0; i < arrLength; i++)
			for(int j = 0; j < arrLength; j++)
				if(currentGrade[i] < currentGrade[j])
					rank[i]++;
				return rank;
	} // func_b
	
	public int func_c(int[] currentGrade, int[] lastGrade) {
	    int maxDiffGrade = 1;
	    for (int i = 0; i < currentGrade.length; i++) {
	        if (maxDiffGrade < currentGrade[i] - lastGrade[i])
	            maxDiffGrade = currentGrade[i] - lastGrade[i];
	    } // for
	    return maxDiffGrade;
	} // func_c
	
	public int solution(int[] currentGrade, int[] lastGrade) {
		int[] rank = func_b(currentGrade);
	    int maxDiffGrade = func_c(currentGrade, lastGrade);
	    int answer = func_a(currentGrade, lastGrade, rank, maxDiffGrade);
	    return answer;
	}
	
} // Solution

public class Test_02 {

	public static void main(String[] args) {
		Solution sol = new Solution();
    	int[] currentGrade = {70, 100, 70, 80, 50, 95};
    	int[] lastGrade = {35, 65, 80, 50, 20, 60};
    	int ret = sol.solution(currentGrade, lastGrade);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}
