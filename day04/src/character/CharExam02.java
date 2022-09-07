package character;

import java.util.Scanner;

public class CharExam02 {

	public static void main(String[] args) {
		// 사용자로부터 하나의 문자를 입력받아서 숫자인지 영문자인지 확인하기
		char ch = ' '; //반드시 '안에 space를 하나 해줘야함
						//String str = "";은 가능!
		//charAt: 특정 위치에 있는 문자열을 꺼내는 것
		String inputString = null;
		
		Scanner sc = new Scanner(System.in);
		inputString = sc.next();
		
		ch = inputString.charAt(0);
		
		//숫자인지 먼저 판별
		
		if(ch>='0' && ch<='9') {
			System.out.println("입력한 글자는 숫자입니다.");
		}
		
		//문자인지 판별
		if((ch>='a' && ch <= 'z') || (ch>='A' && ch<'Z')) {
			System.out.println("입력한 글자는 영문자입니다.");
		}
		
		

	}

}
