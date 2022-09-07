package repection;

public class ExamExam01 {

	public static void main(String[] args) {
		// 1~100까지 합을 구하되, 홀수의 합만 구하시오.
		int num = 1, sum = 1;
		
		if(num % 2 == 1) {
			for (num = 1; num <=100; num++) {
				sum = sum + num;
				
			}
			System.out.println(sum);
		}

	}

}
