package Test_230404_02;

class Solution {
	public int func_a(int[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 5 == 0)
				count += 1;
		}
		
		return count;
	}
	
	public String func_b(int three, int five) {
		if(three > five) return "three";
		else return "five";
	}
	
	public int func_c(int[] arr) {
		int count = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 3 == 0)
				count += 1;
		}
		
		return count;
	}
	
	public String solution(int[] arr) {
		int countThree = func_c(arr);
		int countFive = func_a(arr);
		String answer = func_b(countThree, countFive);
		
		return answer;
	}
}

public class Test_02 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {2, 3, 6, 9, 12, 15, 10, 20, 22, 25};
		String ret = sol.solution(arr);
		
		System.out.println(ret);

	}

}
