package threadExam;

public class ThreadExam01 {
	
	public static void main(String[] args) {//단일 thread
		//미국 드라마 : 자막, 영상 같이 보기
		// 영상이 5장면
		int[] videoArray = {1,2,3,4,5};
		
		
		//자막 5장면
		String[] subtitleArray = {"하니","둘","셋","넷","다섯"};
		
		//영상 출력
		for(int i=0; i<videoArray.length; i++) {
			System.out.println("드라마 영상 출력 : " + videoArray[i]);
			
			//영상이 너무 빨리 지나가니까 잠깐 멈추기 위해서 쓰임=>에러가 발생할 수 있으므로 try catch처리
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//자막 출력
		for(int i=0; i<subtitleArray.length; i++) {
			System.out.println("드라마 자막 출력 : " + subtitleArray[i]);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}//=>이렇게 되면 어떤 일이 하나 끝나고 이것이 나와야함!
			//=>이런 불편함을 해결하기 위해서 멀티 thread를 쓰는 것(여러 순차적으로 처리하는 것)
			//동시에 두가지 일이 일어날 수 있기 때문!!
		}
	}

}
