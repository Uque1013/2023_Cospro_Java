package Test_230411_04;
import java.util.*;

class Solution {
	int func_a(int[] scores, int score) {
		int length = scores.length;
		for(int rank = 0; rank < length; rank++)
			if(scores[rank] == score)
				return rank + 1;
		return 0;
	} // func_a
	
	void func_b(int[] arr) {
		Arrays.sort(arr);
		int length = arr.length;
		int temp = 0;
		for(int i = 0; i <length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[(length - 1) - i];
			arr[(length - 1) - i] = temp;
		} // for
	} // func_b
	
	int func_c(int[] arr, int n){
        return arr[n];
    } // func_c
	
	 public int solution(int[] scores, int n) {
	        int score = func_c(scores, n);
	        func_b(scores);
	        int answer = func_a(scores, score);
	        return answer;
	    } // solution
}

public class Test_01 {

	public static void main(String[] args) {
		Solution sol = new Solution();
        int[] scores = {20, 60, 98, 59};
        int n = 3;
        int ret = sol.solution(scores, n);

        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	}

}
