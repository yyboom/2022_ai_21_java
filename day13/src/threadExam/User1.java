package threadExam;

public class User1 extends Thread{
	private Calculator calculator;

	public Calculator getCalculator() {
		return calculator;
	}

	public void setCalculator(Calculator calculator) {
		this.setName("user1");//thread이름을 설정
		this.calculator = calculator;//공유 갹체 필드에 저장
	}
	
	@Override
	public void run() {
		calculator.setMemory(100);
	}
	

}
