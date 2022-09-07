package threadExam;

public class SubtitleThreadRunnable implements Runnable{
	//자막 Thread
	@Override
	public void run() {
		String[] subtitleArray = {"하니","둘","셋","넷","다섯"};
		
		//영상보다 자막을 조금 늦게 나오게(0.02초정도)
		try {
			Thread.sleep(20);
		} catch (InterruptedException e1) {
		}
		
		//자막출력
		for(int i=0; i<subtitleArray.length; i++) {
			System.out.println("드라마 자막 출력 : " + subtitleArray[i]);
			
			try {
				Thread.sleep(500);//0.5초(1000-1초)
			} catch (InterruptedException e) {
				System.out.println("에러발생!");
			}
		}
	}
	

}
