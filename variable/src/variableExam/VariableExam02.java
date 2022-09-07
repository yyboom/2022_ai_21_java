package variableExam;

public class VariableExam02 {

	public static void main(String[] args) {//중관호를 벗어나면 메모리에서 벗어나게 되므로 조심해야함!!!
		//이름: 홍길동
		//나이:25
		//평균 : 95.4
		//성적:A
		String name = "홍길동";
		int age = 25;
		double average = 95.4;
		char grade = 'A';
		
		System.out.println("이름 : " + name);//+는 문자열을 연결해주는 연산자로도 사용가능
		System.out.println("나이 : " + age);
		System.out.println("평균 : " + average);
		System.out.println("성적 : " + grade);

		final int MAX_SPEED = 10;//상수를 쓸 때는 값의 변화를 추구하고 싶지 않을때 사용한다.
		System.out.println(MAX_SPEED);
		System.out.println(5%2);
	}

}
