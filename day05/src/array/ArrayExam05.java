package array;

import java.util.Arrays;

public class ArrayExam05 {

	public static void main(String[] args) {
		// 로또 번호 구하기
		int [] ball = new int [45];
		
		//ball에 값 담기
		for(int i=0; i<ball.length; i++) {
			ball[i] = i + 1;
		}
		//단긴 값 확인
		//	System.out.println(Arrays.toString(ball));
			
		//ball에 담긴 요소 섞기(자리교환)
			for(int i=0; i<100;i++) {
				int n=0, imsi=0;
				
				n=(int)(Math.random()*10);
				imsi=0;
				
				imsi = ball[0];
				ball[0] = ball[n];
				ball[n] = imsi;
			}
		//ball자리 섞기 후 6개 숫자 뽑기
				System.out.println(ball[0]+","+ball[1]+","+ball[2]+","+ball[3]+","+ball[4]+","+ball[5]);
				
			
			
		

	}

}
