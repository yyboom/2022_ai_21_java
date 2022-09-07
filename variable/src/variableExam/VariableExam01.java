package variableExam;

public class VariableExam01 {//{}는 선언하는 것임, 없으면 실행임

	public static void main(String[] args) {
		int num = 10;//식임, 한번 변수형을 선언하면 그변수의 자료형은 이후로 더이상 바꿀 수 없다.
		
		System.out.println(num);//값임
		
		num=num+7;
		System.out.println(num);
		
		String name = "뚱버릭과 뇽이스맨";
		System.out.println(name);

		double speed = 2.3;
		System.out.println(speed);

	    System.out.println(num+speed);  
	    
	    //변수선언, class등등은 다 모아놓는 것이 제일 좋다. like vivado module!
	}

}
