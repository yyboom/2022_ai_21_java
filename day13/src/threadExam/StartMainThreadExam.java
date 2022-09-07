package threadExam;

public class StartMainThreadExam {

	public static void main(String[] args) {
		//Thread를 실행하는 클래스
		//영상쓰레스, 실행쓰레드 
		Thread subThread = new SubtitleThread01();
		subThread.start();
		
		Thread videoThread = new DramaThread01();
		videoThread.start();

	}

}
