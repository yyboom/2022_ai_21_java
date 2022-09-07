package operExam;

import java.util.Scanner;

public class OperExam01 {

	public static void main(String[] args) {
		// num1이 num2보다 크거나 같으면 : num1*num2
		// num2이 num1보다 크면 : num1+num2
		
		int num1=80, num2=90, result=0;
		String result01=null;
		
		result = (num1 >= num2)? num1*num2 : num1 + num2;
		System.out.println(result);
		
		//num1이 짝수인지 홀수인지 판별해서 출력
		result01 = (num1%2 == 0)? "짝수":"홀수";
		System.out.println(result01);
		
		//문1) 숫자 2개를 입력 받아서 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 결과를 출력
		//next()만 사용
		//수1 + 수2 = ?
		//수1 - 수2 = ?
		//수1 * 수2 = ?
		//수1 / 수2 = ?
		//수1 % 수2 = ?
		Scanner scan = new Scanner(System.in);//키보드로부터 입력받겠음
		
		int number1 = 0, number2 = 0, 
				add = 0, sub = 0, mul = 0, div = 0, rest = 0;
				
	    add = number1 + number2;
	    sub = number1 - number2;
	    mul = number1 * number2;
	    div = number1 / number2;
	    rest = number1 % number2;
		
		number1= scan.nextInt();
		number2= scan.nextInt();
		
		System.out.println("number1 + number2 =" + add);
		System.out.println("number1 - number2 =" + sub);
		System.out.println("number1 * number2 =" + mul);
		System.out.println("number1 / number2 =" + div);
		System.out.println("number1 % number2 =" + rest);
		
		
		//문2) 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		//		학생당 몇 개를 가질 수 있고 최종적으로 몇개가 남는지 작성
		//1인당 연필 개수 = ?
		//나머지 연필 개수 = ?
		
		int pencil = 534, student = 30, student_pencil = 0, rest_pencil = 0;
		
		student_pencil = pencil / student;
		rest_pencil = pencil % student;
		
		System.out.println("1인당 연필 개수 =" + student_pencil);
		System.out.println("나머지 연필 개수 =" + rest_pencil);
		
		//문3)다음에 제시한 예시와 같은 결과가 나오도록 프로그램 작성
		//value = 546일 때 출력형태는 value = 540
		int value = 546;
		
		value = value - 6;
		
		System.out.println(value);
		

	}

}
