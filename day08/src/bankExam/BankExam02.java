package bankExam;

import java.util.Scanner;

public class BankExam02 {
	//예금자들(객체, 인스턴스임)의 목록을 관리할 수 있는 공간 => 배열
	//필드 - static(모든 객체에서 공통적으로 쓸 수 있게, 클래스가 로드 될 때 메모리에 로드)
	private static Account[] accountArray = new Account[100];
	//각각 안에다가 100개의 객체를 담을 수 있게 되는 것임
		//int[] arr = new int[3];
		//String[] str = new String[10];
	private static Scanner scan = new Scanner(System.in);
//메서드	
	public static void main(String[] args) {
		// 각 작업에 따른 메서드 호출을 main에서 해주면 됨
		boolean run = true;
		int selecNo = 0;
		
		while(run) {
			System.out.println("================================================");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("================================================");
			
			System.out.print("선택>");
			selecNo = scan.nextInt();
			
			if(selecNo == 1) {
				createAccount();
				
			}
			else if(selecNo == 2) {
				accountList();

				
			}
			else if(selecNo == 3) {
				deposit();
				
			}
			else if(selecNo == 4) {
				withdraw();
	
			}
			else if(selecNo == 5) {
				System.out.println("종료를 선택하셨습니다.");
				run = false;	
			}
			else {
				System.out.println("잘못 선택하셨습니다. 다시 입력하세요.");
			}
		}
		System.out.println("우리 은행을 방문해주셔서 감사합니다.");
	}
		//계좌생성
	private static void createAccount() {
		String accountNo = null; //지역변수 : 께좌번호
		String owner= null; // 예금주
		int balance = 0; //예금액 20억 이상이 넘어가면 long형으로!
		
		System.out.println("계좌번호 입력>>");
		accountNo = scan.next();
		
		System.out.println("예금주 입력>>");
		owner = scan.next();
		
		System.out.println("예금액 입력>>");
		balance = scan.nextInt();
		
		//입력 받은 값들을 이용해 객체를 생성 Account배열 공간에 저장
		Account newAccount = new Account(accountNo, owner, balance);
		for (int i=0; i<accountArray.length; i++) {
			if(accountArray[i]==null) {
				accountArray[i] = newAccount;
				System.out.println("결과 : 계좌가 생성되었습니다.");
				break;
			}
		}
		
		System.out.println("계좌번호 : "+ accountNo);
		System.out.println("예금주 : "+ owner);
		System.out.println("예금액 : "+ balance);
		System.out.println();
	}
	//계좌목록
	private static void accountList() {
		//목록 가져오기
		for(int i=0; i < accountArray.length; i++) {
//			Account account = accountArray[i];
//			
//			if(account != null) {
//				System.out.println(account.getAccountNo());
//				System.out.println(account.getOwner());
//				System.out.println(account.getBalance());
//			}
			if(accountArray[i] != null) {
				System.out.println(accountArray[i].getAccountNo());
				System.out.println(accountArray[i].getOwner());
				System.out.println(accountArray[i].getBalance());
			}
		}
		System.out.println();	
	}
	//예금
	private static void deposit(){
		//변수
		String accountNo = null;
		int balance = 0;
		//계좌번호, 넣을 금액
		System.out.print("계좌번호: ");
		accountNo = scan.next();
		
		System.out.print("예금액: ");
		balance = scan.nextInt();
		
		//입력한 계좌번호가 있는지 찾아야함 => 계좌번호가 있으면 그 주소를 가져오면 됨
		Account account = findAccount(accountNo);
		//계좌가 없을 때
		if(account == null) {
			System.out.println("찾는 걔좌번호가 없습니다.");
			return;//메서드 안에 return을 넣으면 이 아래쪽은 실행이 되지 않는다.
		}
		//계좌가 있을 때=>기존 예금액 + 현재 입금한 예금액
		else {
			account.setBalance(account.getBalance() + balance);
			System.out.println("입금을 성공하였습니다.");
		}
		System.out.println();
		
	}
	//출금
	private static void withdraw(){
		//변수
		String accountNo = null;
		int balance = 0;
		//계좌번호, 넣을 금액
		System.out.print("계좌번호: ");
		accountNo = scan.next();
		
		System.out.print("출금액: ");
		balance = scan.nextInt();
		
		//입력한 계좌번호가 있는지 찾아야함 => 계좌번호가 있으면 그 주소를 가져오면 됨
		Account account = findAccount(accountNo);
		//계좌가 없을 때
		if(account == null) {
			System.out.println("찾는 걔좌번호가 없습니다.");
			return;//메서드 안에 return을 넣으면 이 아래쪽은 실행이 되지 않는다.
		}
		//잔고 => 기존 예금액 - 현재 예금액
		else if (account.getBalance() < balance) {
			System.out.println("출금하기에 계좌에 있는 돈이 모자랍니다.");
			return;
		}
		else {
			account.setBalance(account.getBalance() - balance);
			System.out.println("입금을 성공하였습니다.");
		}
		System.out.println();
	
			
	}
	//계좌목록 찾기 =>배열에서 찾기 => accountNo와 동일한 account 객체 찾아서 돌려줌
	private static Account findAccount(String accountNo){
		Account account = null;
		
		for(int i=0; i<accountArray.length; i++) {
			//비어 있지 않은 객체만 찾아봄
			if(accountArray[i] != null) {
				String dbAccountNo = accountArray[i].getAccountNo();
				if(dbAccountNo.equals(accountNo)) {
					account = accountArray[i];
					break;
				}
			}
		}
		
		return account;//객체 반환
	}



}
