package ifExam01;

public class IfExam01 {
	
	public static void main(String[] args) {
		//숫자가 짝수이면 숫자*20 한 값을 출력
		//int num = 50;
		
		//if (num % 2 == 0) {
			//System.out.println(num*20);
		//}
		//--------------------------------------
		String strName1 ="홍길동" , strName2 = "홍길동", strName3 = new String("홍길동");
		//이름이 홍길동이면 '홍길동'님 환영합니다. 404호로 가세요
		
		
		if(strName1.equals(strName2)) {
			System.out.println("서로 다른 주소값을 참조");
			
			//str1과 str2가 같이 않으면 '서로 다른 주소값을 참조'출력
			
		}
		
		System.out.println("if문 연습 끝");
	}

}
