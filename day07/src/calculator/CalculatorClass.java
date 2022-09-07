package calculator;

public class CalculatorClass {
	//필드
	public int number1;
	public int number2;
	//이 문제는 필드가 필요없을 수 있음

	
	
	//생성자
	public CalculatorClass() {}
	
	public CalculatorClass(int number1, int number2) {
		this.number1 = number1;
		this.number2 = number2;
	}
	
	//메서드 -> 이 밑에 있는 것은 다 인스턴스 메서드임(정적 메서드랑 다른 것)
	public void calculatorOn(String on) {
		System.out.println("전원 "+ on);
	}
	public void calculatorOff(String off) {
		System.out.println("전원 "+ off);
	}
	
	//메서드 오버로딩
	//메서드 오버로딩의 리턴타입을 보는것이 아님.
	//컴퓨터가 들어가는 자료형의 종류와 순서를 보고 판단할 것이기 때문
	public int calculatorAdd(int number1, int number2) {
		return (number1 + number2);
	}
	public double calculatorAdd(int number1, int number2, double number3) {
		return(number1 + number2 +number3);
	}
	
	
	public int calculatorSub(int number1, int number2) {
		return (number1 - number2);
	}
		
	public int calculatorMul(int number1, int number2) {
		 return (number1 * number2);
	}
	public int calculatorDiv(int number1, int number2) {
		return (number1 / number2);
	}

}
