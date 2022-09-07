package inheritanceExam;

public class BusinessHuman extends Human{
	//필드
	String bhNum;
	//생성자

	public BusinessHuman(String name, int age,String bhNum) {
		super(name, age);
		this.bhNum = bhNum;
	}
	
	//메서드
	void goBusiness() {
		System.out.println(name + "이 회사에 출근합니다.");
	}
	void bhNum() {
		System.out.println("지금 출근하는 사람의 사원번호는"+ bhNum+"입니다.");
	}

}
