package threadExam;

public class DramaThread01 extends Thread{
	@Override
	public void run() {
		int[] videoArray = {1,2,3,4,5};
		
		//영상출력
		for(int i=0; i<videoArray.length; i++) {
			System.out.println("드라마 영상 출력 : " + videoArray[i]);
			
			try {
				Thread.sleep(500);//0.5초(1000-1초)
			} catch (InterruptedException e) {
				System.out.println("에러발생!");
			}
		}
	}

}
