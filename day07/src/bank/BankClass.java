package bank;

public class BankClass {
	//필드
	private String bankNumber;
	private String bankList;
	private String deposit;
	private String withdrawal;
	private String end;
	//생성자
	public BankClass() {
	}
	
	
	
	//메서드
	public void number1(int num1) {
		System.out.println(num1+"인 계좌생성을 선택하였습니다.");
	}
	public void number2(int num2) {
		System.out.println(num2+"인 계좌목록을 선택하였습니다.");
	}
	public void number3(int num3) {
		System.out.println(num3+"인 예금을 선택하였습니다.");
	}
	public void number4(int num4) {
		System.out.println(num4+"인 출금을 선택하였습니다.");
	}
	public void number5(int num5) {
		System.out.println(num5+"인 종료을 선택하였습니다.");
	}



	public String getBankNumber() {
		return bankNumber;
	}



	public void setBankNumber(String bankNumber) {
		this.bankNumber = bankNumber;
	}



	public String getBankList() {
		return bankList;
	}



	public void setBankList(String bankList) {
		this.bankList = bankList;
	}



	public String getDeposit() {
		return deposit;
	}



	public void setDeposit(String deposit) {
		this.deposit = deposit;
	}



	public String getWithdrawal() {
		return withdrawal;
	}



	public void setWithdrawal(String withdrawal) {
		this.withdrawal = withdrawal;
	}



	public String getEnd() {
		return end;
	}



	public void setEnd(String end) {
		this.end = end;
	}
	
	//get,set
	

}
