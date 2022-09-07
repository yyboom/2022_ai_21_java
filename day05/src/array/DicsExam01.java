package array;

public class DicsExam01 {

	public static void main(String[] args) {
//		// 주사위를 두개 던져 나온 눈의 합이 5가 될때까지 출력
//		// 변수 만들기 = firstDics, secondDics
//		// 주사위 던지기 - foseja
//		// while
//		int firstDics = 0, secondDics =0;
//		boolean run = true;
//		
//		while(run) {
//			int result = 0;
//			
//			firstDics = (int)(Math.random()*6) + 1;
//			secondDics  = (int)(Math.random()*6) + 1;
//			
//			//result = (firstDics + secondDics)==5;
//			//if(result)
//			
//			result = firstDics + secondDics;
//			if(result ==5){
//				System.out.println("(" + firstDics + "," + secondDics + ")");
//				
//			}
//		}
		
		
		// 주사위를 두개 던져 나온 눈의 합이 5의 경우의 수가 모두 출력되는 경우
//		// 변수 만들기 = firstDics, secondDics
//		// 주사위 던지기 - foseja
//		// 이중 for문
		
		for(int i=1; i<=6; i++) {
			for(int j=1; j<=6; j++) {
				if (i+j==5) {
					System.out.println("(" + i + "," + j + ")");
				}
			}
		}

	}

}
