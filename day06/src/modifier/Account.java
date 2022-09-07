package modifier;

public class Account {
//은행 계좌에 관한 정보
	
	//계좌번호, 예금주, 예금액
	private String accountNO;
	private String owner;
	private int balance;
	
	//생성자
	public Account(String accountNO, String owner, int balance) {
		this.accountNO = accountNO; //인스턴스 필드 = 지역변수
		this.owner = owner;
		this.balance = balance;
		//source에 가서 선택해서 만들어줄 수도 있음
	}


	public String getAccountNO() {
		return accountNO;
	}

	public void setAccountNO(String accountNO) {
		this.accountNO = accountNO;
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
