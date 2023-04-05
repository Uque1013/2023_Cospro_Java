package Test_230405;
import java.util.*;

class Solution {
	public int solution(int N, int M) {
		int total = 0;
		for(int i = N; i <= M; i++) {
			if(i % 2 == 0) {
				total += i*i;
			} // if(for)
		} // for
		return total;
	} // solution
} // class Solution

public class Test_03 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int N = 4;
		int M = 7;
		int ret = sol.solution(N, M);
		System.out.println("solution 메서드의 반환 값은 "+ret+" 입니다.");

	} // main

} // class Test_03
