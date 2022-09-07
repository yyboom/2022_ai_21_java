package ifElseExam04;

import java.util.Scanner;

public class IfElseExam04 {

	public static void main(String[] args) {
		// score = 83
		// 점수가 90이상이면 우수, 90점 미만 70점 이상이면 "양호"
		//70점 미만이면 "노력요함"
		
		int score = 0;
		
		System.out.println("점수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score >= 90) {
			System.out.println("우수");
		}
		else if(score >=70 && score < 90) {//score < 90은 없어도됨. 위에서 90이 안되기 때문에 밑으로 내려올것!
			System.out.println("양호");
		}
		else {
			System.out.println("노력요함");
		}

	}

}
