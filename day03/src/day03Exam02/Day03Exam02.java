package day03Exam02;

import java.util.Scanner;

public class Day03Exam02 {
	
	public static void main(String[] args) {
		//이름, 국어, 영어, 수학 성적을 입력 받아서
		//평균(소수이하 2자리까지)를 구하고
		//평가는 평균이 60점 이상이면 "통과", 그렇지 않으면 "재시험"
		//평가는 삼항 연산자 이용
		
		//이름  국어 영어 수학 평균 평가
		//========================
		//홍길동 85  90  100 ??  합격
		
		Scanner scan = new Scanner(System.in);
		
		String name = "홍길동", result = null;
		int korLanguage = 0, english = 0, math = 0;
		double average = 0.0;
	
		
		korLanguage = scan.nextInt();
		english = scan.nextInt();
		math = scan.nextInt();
		
		average = (double)(korLanguage + english + math)/ 3.0;
		
		result = (average >= 60)? "통과":"재시험";
		
		System.out.println("이름\t국어\t영어\t수학\t평균\t평가");
		System.out.println("===============================================");
		System.out.printf("%s\t%d\t%d\t%d\t%2.f\t%s\n", name, korLanguage, english, math, average, result);
		System.out.println("===============================================");
		
		
	}

}
