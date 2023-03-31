package Test_230323;
import java.util.*;

class Solution {
	public int[] solution(int[] arr) {
		int left = 0;
		int right = arr.length - 1;
		while (left < right) {
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left += 1;
			right -= 1;
		}
		return arr;
	}
}

public class Test_05 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] arr = {8, 9, 5, 2, 5, 2, 3};
		int[] ret = sol.solution(arr);
		
		System.out.println(Arrays.toString(ret));
	}

}
