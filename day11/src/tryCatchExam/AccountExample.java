package tryCatchExam;

public class AccountExample {

	public static void main(String[] args) {
		Account account = new Account();
		
		//예금하기 20000
		account.deposit(20000);
		//10000원 입금 후 현재까지 예금액이 얼마인지 확인
		System.out.println("예금액 :"+ account.getBalance());
		
		//출금하기 5000
		try {
			account.withdraw(23000);
			System.out.println("출금 후 예금액:" + account.getBalance());
		} catch (BalanceInsufficientException e) {
			System.out.println(e.getMessage());
		} //throws로 덤진을 받았으니까 try-catch처리를 해줘야함!!
		

	}

}
