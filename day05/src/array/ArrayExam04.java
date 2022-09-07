package array;

public class ArrayExam04 {

	public static void main(String[] args) {
//		int a=8, b=10, imsi =0;
//		System.out.println(a+","+b);
//		
//		imsi = a;
//		a=b;
//		b=imsi;
//		
//		System.out.println(a+","+b);
//	//	==============================
//		int c=9, d=7, e=10,max=0;
		
		//성적을 가지고 총점, 평균과 최대값, 최솟값 구하기
		//총정 =?
		//평균 = ?
		//최댓값 = ?
		//최솟값 = ?
		
		int sum=0, max=0, min=0;
		double average = 0.0;
		int[] score = new int[] {85, 90, 55,36,98, 75};//중괄호를 줄때는 int안에 숫자를 넣지 않음
		max = score[0];//for문 안에 있으면 매번 초기값이 다시 설정되기 때문에 밖에다가 써줘야함
		min = score[1];
		//sum = score[0] + score[1] + score[2] + score[3] +score[4]+ score[5];
		//average = (score[0] + score[1] + score[2] + score[3] +score[4]+ score[5])/3;
		for(int i=0; i<score.length; i++) {
			//sum
			
			sum += score[i];
			
			//max
			
			if(max < score[i]) {
				max = score[i];
			}
			
			//min
			
			if(min > score[i]) {
				min = score[i];
			}
			
		}
		average = (double)sum / score.length;//형변환 시켜줌 정수/정수 => 정수
		
		System.out.println(sum);
		System.out.println(average);
		System.out.println(max);
		System.out.println(min);
		
		
		

	}

}
