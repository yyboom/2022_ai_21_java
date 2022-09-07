package apiExam;

import java.util.Scanner;

public class WrapperExam {

	public static void main(String[] args) {
		// 박싱(boxing)
		//int -> 10 => Integer로 처리하고 싶음
		//Integer
		//Integer boxInt = new Integer(10);//deprecated
		Integer boxInt = Integer.valueOf(10);
		Double boxDouble = Double.valueOf(13.5);
		//	Integer boxInt = 10;//자동 박싱 가능!
		
		//언박싱(unBoxing)
		//int unboxInt = boxInt;//자동 언박싱 가능
		int unboxInt = boxInt.intValue();
		double unboxDouble = boxDouble.doubleValue();
//		//example)문자열을 기본 타입으로 변환
//		Scanner scan = new Scanner(System.in);
//		System.out.println("국어, 영어, 수학, 점수 입력>>");
//		int kor = Integer.parseInt(scan.next());
//		int eng = Integer.parseInt(scan.next());
//		int mat = Integer.parseInt(scan.next());
		
		
		//기본타입일 때는 == 은 그 변수가 담고있는 값이 같은가를 물어보는 것이고
		//class형이면 그 변수의 주소가 같은지를 판별해주는 것
		//=>class에서는 equals를 재정의하여 같은지 안같은지를 판단해주는 메서드를 씀
		int a=3,b=3;
		System.out.println(a==b);
		
		Integer boxA =300;
		Integer boxB =300;
		System.out.println(boxA == boxB); //-128~127까지는 자동으로 처리함!!

	}

}
