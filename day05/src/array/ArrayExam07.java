package array;

public class ArrayExam07 {

	public static void main(String[] args) {
		// 번호 국어 영어 수학
		//int [][] score = new int[5][4];
		int[][] score = {
				{1,50,60,90},
				{2,52,85,96},
				{3,90,95,100},
				{4,88,79,65},
				{5,90,70,78}
		};
		String[] name = {"홍길동", "박자바", "이상순", "우영우"};
		
		System.out.println("번호\t이름\t국어\t영어\t수학\t");
		for(int i=0; i<score.length; i++) {
				System.out.printf("%d\t%s\t%d\t%d\t%d\n", score[i][0],name[i],score[i][1],score[i][2],score[i][3]);
			
			
		}
				
		

	}

}
