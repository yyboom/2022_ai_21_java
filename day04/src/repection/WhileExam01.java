package repection;

import java.util.Scanner;

public class WhileExam01 {

	public static void main(String[] args) {
		// 컴퓨터가 랜덤으로 값을 산출하면, 우리가 그 값을 맞추기
		//우리가 입력한 값이 컴퓨터가 산출한 값보다 크면 "더 작은 값을 입력하세요."
		//우리가 입력한 값이 컴퓨터가 산출한 값보다 작으면 "더 큰 값을 입력하세요."
		//맞으면 "정답입니다."
		//컴퓨터 범위 1~100
		
		Scanner scan = new Scanner(System.in);
		
		int num = 1, usernum = 1;
		boolean run =true;
		
		
		num = (int)(Math.random()*100) + 1;
		while(run) {
			System.out.println("1~100까지의 값을 입력하세요 : ");
			usernum = scan.nextInt();
			
			if(num < usernum) {
				System.out.println("더 작은 값을 입력하세요.");
			}
			else if(num > usernum) {
				System.out.println("더 큰 값을 입력하세요.");
			}
			else {
				System.out.println("정답입니다.");
				run = false;
			}
			
		}

	}

}
