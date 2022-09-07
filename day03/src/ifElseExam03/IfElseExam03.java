package ifElseExam03;

import java.util.Scanner;

public class IfElseExam03 {

	public static void main(String[] args) {
		//은료를 선택하세요. 1.아메리카노, 2-홍차, 3.라떼, 4. 아인슈페너, 5. 콜라
		int num = 0;
		
		System.out.println("음료를 선택하세요.");
		System.out.println("1. 아메리카노, 2. 홍차, 3. 라떼, 4. 아인슈페너, 5. 콜라");
		
		Scanner scan = new Scanner(System.in);
		num = scan.nextInt();
		
		switch(num) {
		case 1 :
			System.out.println("1--> 아메리카노를 주문하셨습니다.");
			break;
		case 2 :
			System.out.println("2--> 홍차를 주문하셨습니다.");
			break;
		case 3 :
			System.out.println("3--> 아인슈페너를 주문하셨습니다.");
			break;
		case 4 :
			System.out.println("4--> 라떼를 주문하셨습니다.");
			break;
		case 5 :
			System.out.println("5--> 콜라를 주문하셨습니다.");
			break;
		default :
			System.out.println("주문번호 오류. 다시 입력해주세요.");
			break;
			
		}
		
		
//		if(num == 1) {
//			System.out.println("1--> 아메리카노를 주문하셨습니다.");
//		}
//		else if(num == 2) {
//			System.out.println("2--> 홍차를 주문하셨습니다.");
//		}
//		else if(num == 3) {
//			System.out.println("3--> 라떼를 주문하셨습니다.");
//		}
//		else if(num == 4) {
//			System.out.println("4--> 아인슈페너를 주문하셨습니다.");
//		}
//		else if(num == 5) {
//			System.out.println("5--> 콜라를 주문하셨습니다.");
//		}
//		else {
//			System.out.println("주문번호 오류. 다시 입력해주세요.");
//		}

		
		
	//=============================================
	
	}

}
