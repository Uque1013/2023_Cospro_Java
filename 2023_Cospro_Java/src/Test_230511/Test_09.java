package Test_230511;

class Solution {
    public int solution(int day, int[] numbers) {
    	// day: 며칠인지 나타냄
    	// numbers: 차들의 번호를 담고 있는 배열
        int count = 0;
        for(int i = 0; i < numbers.length; i++) 
        	if(numbers[i]%2 == day%2)
        	// numbers[i]%2가 day%2와 같으면 count를 증가해준다.
    			count++;
        return count;
    }
}

public class Test_09 {

	 public static void main(String[] args) {
	        Solution sol = new Solution();
	        int day = 17;
	        int[] numbers = {3285, 1724, 4438, 2988, 3131, 2998};
	        int ret = sol.solution(day, numbers);
	    
	        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
	        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");
	    }

}
