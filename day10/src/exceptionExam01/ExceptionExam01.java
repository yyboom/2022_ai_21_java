package exceptionExam01;

public class ExceptionExam01 {

	public static void main(String[] args) {//예외처리를 해줘야함.
		//에러가 생길 만한 것들을 try, catch를 이용하여 에러가 났을 때 다른 것이 출력되도록 유도해줌
//		try {
//			int x=7/0;
//			System.out.println(x);
//		}
//		catch(Exception e) {
//			System.out.println("0으로 나눌 수 없습니다.");
//		}
		try {
			int x=7/0;
			System.out.println(x);
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		catch(Exception e) {//위의 예외도 아닌 나머지는 다 이 예외문으로 처리해줘라!!
			System.out.println("예외발생");
		}
		finally {//에러, 성공 둘다 계속 실행되는 것임
			System.out.println("줄거운 금요일~~");
		}

	}

}
