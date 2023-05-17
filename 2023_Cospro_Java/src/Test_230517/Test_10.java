package Test_230517;

class Solution {
	public int solution(int[] arr) {
		int answer = 0;
		for(int i = 0; i < arr.length; i++)
			for(int j = 0; j < arr.length; j++)
				if(arr[i] % 2 == 0 && arr[i] / 2 == arr[j]) {
					answer ++;
					break;
				}
		return answer;
	}
}

public class Test_10 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {4, 8, 3, 6, 7};
		int ret = sol.solution(arr);
		
		System.out.println(ret);

	}

}
