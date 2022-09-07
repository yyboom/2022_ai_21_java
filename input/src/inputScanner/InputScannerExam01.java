package inputScanner;

import java.util.Scanner;

public class InputScannerExam01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);//키보드로부터 입력받겠음
		//int num =0;
		String strTest01 = null, strTest02 = null;//""
		String message = "이름과 점수를 입력>>";
		
		System.out.println(message);
		//num=scan.nextInt();//정수
		strTest01= scan.next();
		strTest02= scan.next();

		//System.out.println("입력된 값 = " + num);
		System.out.println("이름 = " + strTest01);
		System.out.println("정수 = " + strTest02);
		
		

	}

}
