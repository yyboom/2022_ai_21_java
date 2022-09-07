package bankExam;

public class Account {
	//필드-인스턴스로, 정보제한(정보은닉, 캡슐화)
	private String accountNo;
	private String owner;
	private int balance;
	
	
	//생성자-계좌번호, 에금주, 예금액을 외부로부터 받아오기
	public Account(String accountNo, String owner, int balance) {
		//super();//부모생성자를 호츌한다.
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}


	//메서드
	//get,set
	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	

}
