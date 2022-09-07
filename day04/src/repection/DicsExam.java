package repection;

public class DicsExam {

	public static void main(String[] args) {
//		// 주사위 눈
//		int nun = 0;
//		
//		for(int i=1; i<=3; i++ ) {
//			nun = (int)(Math.random()*6) + 1;//주사위 눈은 총 6종류 존재함
//										 //1,2,3,4,5,6가 나올 수 있음
//			System.out.println(nun);
//			
//		}
		
//주사위의 눈이 5가 나올 때까지 반복해서 		
		int nun = 0;
		
//		while(nun != 5) {
//			nun = (int)(Math.random()*6) + 1;
//			
//			System.out.println(nun);
//		}
		
		while(true) {
			nun = (int)(Math.random()*6) + 1;
			if(nun==5 ) {
				break;
			}
			System.out.println(nun);
		}

	}

}
