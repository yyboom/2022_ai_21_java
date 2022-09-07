package methodExam;

public class Computer {

	//매개변수 값을 배열 받기
	int sum(int[] values) {//인스턴스 메서드임->객체를 생성해야 사용할 수 있음
		int total = 0;//지역변수
		
		for(int i=0; i<values.length; i++) {
			total += values[i];
		}
		return total;
	}
}
