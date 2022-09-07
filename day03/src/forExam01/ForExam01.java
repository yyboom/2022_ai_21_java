package forExam01;

public class ForExam01 {

	public static void main(String[] args) {
		// 1~10까지의 합
		int sum = 0;
		
		for (int i = 1; i<=10; i++) { //ㅑ는 for block안에서만 사용ㅇ할 수 있음->지역변수
			//i++:i=i+1
			sum += i; //sum = sum + i
			System.out.println("i=" + i + "sum" + sum);
		}
		
		System.out.println("즐거운 for 문");

	}

}
