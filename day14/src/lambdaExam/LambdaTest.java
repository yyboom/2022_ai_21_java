package lambdaExam;

public class LambdaTest {

	public static void main(String[] args) {
		//이완성 메서드를 포함하고 있어서 객체 생성이 안됨!
		//해결 방법: 1. 자식에서 구현=> 객체 생성
		//		  2. 직접 익명 구현 객체 생성 => 직접 여기서 완성하겠다
		
		//방법1
		FunctionalInterfaceExam fInter = new FunctionalInterfaceExam() {
			
			@Override
			public void show() {
				System.out.println("완성.");
				
			}//이것을 자식으로 만들어서 상속받아도 되지만 이거 하나만 구현할 것이면 굳이 클래스 하나를 
			//더 생성할 이유가 없음. 따라서 익명의 이너클래스를 이용해 구현.
			//자식 클래스를 만들어서 구현해도됨!
		};
		fInter.show();
		
		//방법2
		FunctionalInterfaceExam fLamda = () ->{//함수이름까지 제거
			//우리가 이걸 제거했다는 것은 -> 를 써서 알려줌!
			//아래쪽에 인터페이스에서 추상 메서드가 "1개" 있을때만 가능한 방법임!
				System.out.println("람다식으로 보는 중");
				
			};
		fLamda.show();
//===================================================================
		//방법1
		TestExamImpl te = new TestExamImpl();
		te.test();
		te.sample();
		te.showInfo();
		
		//방법2
		//interface에서 바로 다이렉트로 넘어오게 하는것
		TestExam teIner01 = new TestExam() {

			@Override
			public void test() {
				System.out.println("익명 구현 객체의 test재정의");
				
			}

			@Override
			public void sample() {
				System.out.println("익명 구현 객체의 sample재정의");
				
			}

			@Override
			public void showInfo() {
				System.out.println("익명 구현 객체의 showInfo재정의");
				
			}
		//완성되지 않은 메서드가 3개 이기 때문에 Lamda식으로는 구현할 수 없음
		//어떤 메서드를 의미하는지 컴퓨터가 판단할 수 없기 때문
		};
		teIner01.test();
		teIner01.sample();
		teIner01.showInfo();
		
		
	}

}
