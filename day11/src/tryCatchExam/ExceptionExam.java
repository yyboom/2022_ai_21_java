package tryCatchExam;

public class ExceptionExam {

	public static void main(String[] args) {
		try {
			System.out.println(12/0);
		}
		catch(Exception e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());//error의 원린이 뭔지 보여주는 것임!
			e.printStackTrace();//프로그램 안에는 넣으면안됨!! 반드시 확인후 주석처리해야함.
			System.out.println(e.toString());//error에 대한 것을 주석처리 된것으로 출력할 수 있음
											//개발용으로만 사용해야함!!
			//database에서 사용하는 것
//			String message = e.getMessage();
//			if(message.equals("1004")) {
//				System.out.println("~~~~~~~");
//			}
			//database에서 예외처리하는 방법
		}

	}

}
