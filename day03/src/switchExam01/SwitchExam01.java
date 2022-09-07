package switchExam01;

import java.util.Scanner;

public class SwitchExam01 {

	public static void main(String[] args) {
		int won = 35670;
		String state = null;
		
		// 원을 주었을 때 달러(usd), 중국(cny), 일본(jpy)
		//switch
		System.out.println("나라를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		state = scan.next();

		switch(state) {
		case "UnitedState" :
			System.out.println(won/1312.01 + "usd");
			break;
		case "China" :
			System.out.println(won/193.95 + "cnv");
			break;
		case "Japan" :
			System.out.println(won/9.85 + "jpy");
			break;
		default :
			System.out.println("다시 선택하여 주십시오.");
			break;
		}
	}

}
