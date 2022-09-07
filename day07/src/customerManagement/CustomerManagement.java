package customerManagement;

public class CustomerManagement {
	//필드
	private int customerID;
	private String customerName;
	private String customerGrade;
	private double bonusPoint;
	private double bonusRatio;
	//생성자
	//기본생성자
	public CustomerManagement() {
		this.customerGrade = "SILVER";
		this.bonusRatio = 0.01;
	}
	//매개값이 있는 생성자
	public CustomerManagement(int customerID, String customerName, double bonusPoint) {
		this.customerID = customerID;
		this.customerName = customerName;
		this.bonusPoint = bonusPoint;
		//실행 클래스에서 바로 넘겨주고 싶을때 사용
	}
	
	
	
	//메서드
	//접근제한자 리턴타입 메서드명(매개변수...){}
	public int calcPrice(int price) {//price를 외부로 넘기게 하기 위해서 return과 같은 type으로 반환@
		bonusPoint += price * bonusRatio;
		return price;
	}
	public void showCustomerInfo() {//그냥 보여주고 싶을때 void로
		System.out.println(customerName + "고객님 등급은 " + customerGrade + 
				"입니다. 보너스 포인트는 " + bonusPoint + "입니다.");
	}
	//	public String showCustomerInfo() {//그냥 보여주고 싶을때 void로
	//String result = null;
	//result = customerName + "고객님 등급은 " + customerGrade + "입니다."
	//result += "보너스 포인트는 " + bonusPoint + "입니다.";
	//return result;
//}
	public int getCustomerID() {//필드를 읽어서 외부로 내보냄
		return customerID;
	}
	public void setCustomerID(int customerID) {//외부로부터 값을 받아서 필드에 넘기는 역할
		this.customerID = customerID;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerGrade() {
		return customerGrade;
	}
	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}
	public double getBonusPoint() {
		return bonusPoint;
	}
	public void setBonusPoint(double bonusPoint) {
		this.bonusPoint = bonusPoint;
	}
	public double getBonusRatio() {
		return bonusRatio;
	}
	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}
	
	

}
