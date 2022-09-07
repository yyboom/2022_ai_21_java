package bankExam;

import java.util.Scanner;

public class BankExam01 {
	
	public static void main(String[] args) {
		//변수
		int inputNum = 0;
		boolean go = true;
		//객체생성
		Scanner scan = new Scanner(System.in);
		BankExam cho = new BankExam();
		//실행
		
		while(go) {
			System.out.println("================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("================================================");
			
			System.out.print("선택>");
			inputNum = scan.nextInt();
			
			if(inputNum == 1) {
				cho.number1(inputNum);
				creatAccount();//밑에서 짜논 메서드를 호출함
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
//계좌생성
private static void creatAccount() {//메서드임->재사용이 좋음
	//만약 반환 타입이 있다면 반환타입을 위로 가지고 올 것!지금은 void라 없음.
	String accountNo = null; //지역변수 : 께좌번호
	String owner= null; // 예금주
	long balance = 0L; //예금액 20억 이상이 넘어가면 long형으로!
	
	Scanner scan = new Scanner(System.in);
	System.out.println("계좌번호 입력>>");
	accountNo = scan.next();
	
	System.out.println("예금주 입력>>");
	owner = scan.next();
	
	System.out.println("예금액 입력>>");
	balance = scan.nextLong();
	
	System.out.println("계좌번호 : "+ accountNo);
	System.out.println("예금주 : "+ owner);
	System.out.println("예금액 : "+ balance);
}


}
