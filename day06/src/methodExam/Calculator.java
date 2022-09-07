package methodExam;
//전원 켜기, 전원 끄기, 덧셈, 뺄셈, 곱셈, 나눗셈

public class Calculator {
//1. class(설계도)만들기 -> 객체생성 -> 객체사용
//클래스 작성
	//필드
	
	
	//생성자
	
	
	//메서드
	//1. 전원 켜기 
	public void powerOn() { //void: 결과를 반환하지 않고 여기서 실행한 후 끝낸다는 것
		System.out.println("전원을 켭니다.");
	}
	//2. 전원 끄기
	public void powerOff() {
		System.out.println("전원을 끕니다.");
	}
	//3. 더하기:정수 두개만 받아서 처리
	public int add(int num1, int num2) { //매개변수(지역변수)
		   //return값이 정수이기 때문에 int로!
		int result = num1 + num2;
		return result;//return뒤에는 어떤 것이 들어와도 실행하지 않음
		// 결과값을 가지고 자신을 호출한 곳으로 되돌아가라는 의미임
	}	
	//4. 나눗셈
	public int division(int dinum1, int dinum2) {
		int result = dinum1 / dinum2;
		return result;
		}
//		else {
//			System.out.println("0으로 나눌 수 없음");
//			//break; // break와 같음, 그냥 결과값없이 메서드를 빠져 나간다는 의미임
//					
//		}
		
	public double avg(int x, int y) {
		double sum = add(x,y);//같은 클래스에 있으므로 그대로 쓸 수 있음, 강제 형변환 시켜준 것
		double result = sum / 2;
		return result;
	}
	
	
}
