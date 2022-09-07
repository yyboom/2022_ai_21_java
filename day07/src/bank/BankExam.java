package bank;

import java.util.Scanner;

public class BankExam {

	public static void main(String[] args) {
		//변수
		int inputNum = 0;
		boolean go = true;
		//객체생성
		Scanner scan = new Scanner(System.in);
		BankClass cho = new BankClass();
		//실행
		
		while(go) {
			System.out.println("================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("================================================");
			
			System.out.print("선택>");
			inputNum = scan.nextInt();
			
			if(inputNum == 1) {
				cho.number1(inputNum);
			}
			else if(inputNum == 2) {
				cho.number2(inputNum);
			}
			else if(inputNum == 3) {
				cho.number3(inputNum);
			}
			else if(inputNum == 4) {
				cho.number4(inputNum);
			}
			else if(inputNum == 5) {
				cho.number5(inputNum);
			}
			go = true;
		}
		
		

	}

}
