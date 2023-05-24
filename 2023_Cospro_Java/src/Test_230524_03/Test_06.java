package Test_230524_03;

/*=======================================================
 * 4차시 6번 : 4차 2급 6_initial_code.java
 =========================================================*/
class Solution {
    public int solution(int point) {
        if (point < 1000)
            return 0;
        return point / 100 * 100;
    }
}

public class Test_06 {

	public static void main(String[] args) {
		Solution sol = new Solution();
        int point = 2323;
        int ret = sol.solution(point);
        
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("solution 메소드의 반환 값은 " + ret + " 입니다.");

	}

}
