package operHomework;

import java.util.Scanner;

public class OperHomework01 {

	public static void main(String[] args) {
				
		
		//문1) 숫자 2개를 입력 받아서 덧셈, 뺄셈, 곱셈, 나눗셈, 나머지 결과를 출력
		//next()만 사용
		//수1 + 수2 = ?
		//수1 - 수2 = ?
		//수1 * 수2 = ?
		//수1 / 수2 = ?
		//수1 % 수2 = ?
		Scanner scan = new Scanner(System.in);//키보드로부터 입력받겠음
		
		String number1 = null, number2 = null;//입력받을 숫자 2개 문자열로 받음
												//because of null
		int add = 0, sub = 0, mul = 0, div = 0, rest = 0;//덧셈 뺄셈 골셉 나눗셈 나머지에 초기값 지정(초기화)
		String message = "number1과 number2를 입력>>";//처음에 나올 메세지 변수에 넣기
		
		System.out.println(message);//메세지 출력
		number1 = scan.next();//숫자 두개 문자열로 scan
		number2 = scan.next();
		
		//문자열로 scan한 숫자두개를 가지고 사칙연산 하기 위해선 정수로 형변환해서 더해줘야함
	    add = Integer.parseInt(number1) + Integer.parseInt(number2);
	    sub = Integer.parseInt(number1) - Integer.parseInt(number2);
	    mul = Integer.parseInt(number1) * Integer.parseInt(number2);
	    div = Integer.parseInt(number1) / Integer.parseInt(number2);
	    rest = Integer.parseInt(number1) % Integer.parseInt(number2);

	   
		//사칙연산한거 출력
		System.out.println("number1 + number2 = " + add);
		System.out.println("number1 - number2 = " + sub);
		System.out.println("number1 * number2 = " + mul);
		System.out.println("number1 / number2 = " + div);
		System.out.println("number1 % number2 = " + rest);
		
		
		//문2) 534자루의 연필을 30명의 학생들에게 똑같은 개수로 나누어 줄 때
		//		학생당 몇 개를 가질 수 있고 최종적으로 몇개가 남는지 작성
		//1인당 연필 개수 = ?
		//나머지 연필 개수 = ?
		
		//초기화 설정: 초기 연필개수, 학생수, 1인당 가져간 연필수, 남은 연필수
		int pencil = 534, student = 30, student_pencil = 0, rest_pencil = 0;
		
		//대입
		student_pencil = pencil / student;
		rest_pencil = pencil % student;
		
		//출력
		System.out.println("1인당 연필 개수 = " + student_pencil);
		System.out.println("나머지 연필 개수 = " + rest_pencil);
		
		
		//문3)다음에 제시한 예시와 같은 결과가 나오도록 프로그램 작성
		//value = 546일 때 출력형태는 value = 540
		
		//이문제 같은 경우는 굳이 상수선언을 해주지 않아도 된다.
		//초기화            //상수선언
		int value = 546, SUB_VALUE = 6;
		
		//변수   //값      //상수만큼 빼주기
		value = value - SUB_VALUE;
		
		//출력
		System.out.println(value);
		

	}


}
