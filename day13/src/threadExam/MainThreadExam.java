package threadExam;
//실행
public class MainThreadExam {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		User1 user1 = new User1();
		user1.setCalculator(calculator);//공유 객체 설정
		user1.start();
		
		User2 user2 = new User2();
		user2.setCalculator(calculator);//공유 객체 설정
		user2.start();
	}

}
