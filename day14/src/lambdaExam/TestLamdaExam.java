package lambdaExam;

public class TestLamdaExam {

	public static void main(String[] args) {
		// 익명이너클래스
		TestA ta = new TestA() {

			@Override
			public void method01() {
				System.out.println("즐거운 금요일");
				System.out.println("TestA인터페이스의 익명이너클래스 method01메서드 재정의");

			}
		};
		ta.method01();
		
		//람다식
		TestA taLam = () -> {
				System.out.println("즐거운 금요일");
				System.out.println("TestA인터페이스의 람다식 method01메서드 재정의");
			
		};
		taLam.method01();
		System.out.println();
//============================================================================
		// 익명으로 구현
		TestB tb = new TestB() {

			@Override
			public int method02(int num) {
				int sum = 0;
				sum = num + 30;
				return sum;

			}

		};

		int result = tb.method02(5);
		System.out.println("TestB의 method02(5)를 호출 - 익명" + result);
		System.out.println();

		// 람다식
		TestB tbLam = (int num) -> {// return타입이랑 매개변수 타입이랑 같으면
			// num앞에 int는 생략 가능 => (num)
			// 매개변수 값이 하나만 있을 때는 괄호까지도 생략 가능! => num
			int sum = 0;
			sum = num + 30;
			return sum;

		};

		int resultLam = tbLam.method02(5);
		System.out.println("TestB의 method02(5)를 호출 - 람다식" + resultLam);
		System.out.println();
//==============================================================================

		TestC tcLam = () -> {
			System.out.println("안녕");
		};
		tcLam.method03();

		// 출력문이 하나일때 중괄호 생략 가능
		TestC tcLam01 = () -> System.out.println("안녕");
		tcLam01.method03();
		System.out.println();
//=================================================================
		// 매개타임이 같을때 생략 가능, return생략 가능, 중괄호 생략 가능
		TestD tdLam = (a, b) -> a + b;

	}

}
