package customerManagement;

public class CustomerExam {

	public static void main(String[] args) {
		//객체 생성
		
		CustomerManagement hong = new CustomerManagement();
		hong.setCustomerName("홍길동");
		hong.setCustomerID(1001);
		hong.calcPrice(15000);
		
		System.out.println(hong.getCustomerName());
		System.out.println(hong.getCustomerID());
		
		hong.showCustomerInfo();
		
		
	}

}
