package Test_230406;
import java.util.*;

class Solution {
	public int solution(int attack, int recovery, int hp) {
		int count = 0;
		while(true) {
			count += 1;
			hp -= attack;
			if(hp <= 0)
				break;
			hp += recovery;
		}
		return count;
	}
}

public class Test_05 {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int attack = 30;	// 캐릭터의 공격력
		int recovery = 10;	// 몬스터가 회복하는 체력
		int hp = 60;		// 몬스터의 초기 체력
		int ret = sol.solution(attack, recovery, hp);
		
		System.out.println(ret);
	}

}
