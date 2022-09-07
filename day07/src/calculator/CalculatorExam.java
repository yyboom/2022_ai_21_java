package calculator;

import java.util.Scanner;
public class CalculatorExam {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//변수
		int num1 = 0;
		int num2 = 0;
		
		// 객체생성
		CalculatorClass cho = new CalculatorClass();
		
		//실행
		cho.calculatorOn("ON");
		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		System.out.println(cho.calculatorAdd(num1, num2));
		System.out.println(cho.calculatorAdd(num1, num2, 7.5));
		System.out.println(cho.calculatorSub(num1, num2));
		System.out.println(cho.calculatorMul(num1, num2));
		System.out.println(cho.calculatorDiv(num1, num2));
		
		cho.calculatorOff("OFF");

	}

}
