package tryCatchExam;
//예금 잔고 부족시 예외 처리
//은행 계좌(Account) 클래스를 통해 출금(withdraw)메서드에서 잔고 (balance) 필드와
//출금액을 비교해서 잔고 부족하면 BalanceInsufficientException를 발생시키기
//내가 만든 예외를 발생시키고 싶은 클래스임
public class BalanceInsufficientException extends Exception{
	public BalanceInsufficientException() {}
	public BalanceInsufficientException(String message) {
		super(message);
	}

}
