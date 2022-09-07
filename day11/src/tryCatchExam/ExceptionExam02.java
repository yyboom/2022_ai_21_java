package tryCatchExam;

public class ExceptionExam02 {

	public static void main(String[] args) {
		try {
			System.out.println(7/0);//ArithmeticException
			int num = Integer.parseInt("10A");
		}
		catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");//모든 예외는 Trowable를 상속받음. Throwable 클래스의 메서드
			System.out.println(e.getMessage());//에러 메세지 출력. Throwable 클래스의 메서드	
		}
		catch(NumberFormatException e) {
			System.out.println("정수로 변환할 수 없는 문자열입니다.");
			e.printStackTrace();//에러 발생이 전달되는 경로 출력, 개발이 끝나면 반드시 주석처리 또는 제거	
		}
		catch(Exception e) {//특정 예외가 아닌 예외들은 가장 마지막에 넣어줘야 함! 위쪽에서 찾다가 없으면 밑의
			//예외처리로 오게 되는 것임
			System.out.println("예외 발생");
			System.out.println("실행할 수 없음");
		}
	}

}
