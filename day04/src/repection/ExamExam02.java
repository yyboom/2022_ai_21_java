package repection;

public class ExamExam02 {

	public static void main(String[] args) {
		// 주사위 2개를 던져서 눈의 합 => 5인 것말 출력
		// 출력 형태 (1,4) (2,3) (4,1) (3,2)
		int num1 = 1, num2 = 1;
		
			for (num1 = 1; num1 <=6; num1++) {
				for (num2 = 1; num2 <=6; num2++) {
					if(num1 + num2 ==5) {
						System.out.print("(" + num1 + "," + num2 + ")");
				}
				
			}
		}

	}

}
