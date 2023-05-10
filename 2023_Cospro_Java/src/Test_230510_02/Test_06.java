package Test_230510_02;

class Solution {
	public String solution(int tileLength) {
		String answer = "";
		String com = "RRRGGB";
		if(tileLength % 6 == 1 || tileLength % 6 == 2 || tileLength % 6 == 4)
			answer = "-1";
		else
			for(int i = 0; i < tileLength; i++)
				answer += com.charAt(i % 6);
		return answer;
	}
}

public class Test_06 {

	public static void main(String[] args) {
		Solution sol = new Solution();
        int tileLength1 = 11;
        String ret1 = sol.solution(tileLength1);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret1 + " 입니다.");

        int tileLength2 = 16;
        String ret2 = sol.solution(tileLength2);

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret2 + " 입니다.");

	}

}
