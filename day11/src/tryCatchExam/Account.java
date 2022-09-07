package tryCatchExam;

public class Account {//예금계좌
	private long balance;

	public Account() {}
	
	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}
	
	//예금하기(입금액)
	public void deposit(int money) {
		balance += money;
	}
	
	//출금하기(출금액) , 출금하면서 잔액이 부족하면 예외 떠넘기기
	public void withdraw(int money) throws BalanceInsufficientException{//예외 발생하면 자신을 호출한 곳으로 예외를 떠넘기기
		//throws는 넘기는 것!!
		if(balance < money) {//사용자 정의 예외 발생
			//jvm에게 예외를 발생시키도록 하고, 
			//(사용자가 만든 예외이므로 이런 예외를 발생시키라고 말을 해줘야함!=>throw)=>예외 객체를 생성하는 것!!
			throw new BalanceInsufficientException("잔고부족:"+(money-balance)+"모자람");
		}
		else {
			balance -= money;
		}
	}
	

}
