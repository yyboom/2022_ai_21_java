package day03Exam01;

import java.util.Scanner;

public class Day03Exam01 {
	
	public static void main(String[] args) {
		//숫자를 입력받아서 홀수와 짝수를 구별해서 출력
		//홀수 => 숫자 % 2 ==1
		//짝수 => 숫자 % 2 ==0
		
		//변수 선언 => 숫자입력, 메세지, 홀수/짝수
		//Scanner
		
		//입력->판별(삼항연산자)
		
		Scanner scan = new Scanner(System.in);
		
		int number = 0;
		String message = "number 입력>>", result = null;//처음에 나올 메세지 변수에 넣기
		
		System.out.println(message);//메세지 출력
		number = Integer.parseInt(scan.next());
		
		result = (number % 2 == 0)? "짝수":"홀수";
		
		System.out.println(result);
		
		
		
	}

}
