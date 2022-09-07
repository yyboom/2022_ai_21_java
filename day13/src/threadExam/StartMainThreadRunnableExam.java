package threadExam;

public class StartMainThreadRunnableExam {

	public static void main(String[] args) {
		
		//자막
		Runnable subRun = new SubtitleThread01();
		Thread subThr = new Thread(subRun);
		subThr.start();
		
		//영상
		Thread draRun = new Thread(new DramaRunnable());
		draRun.start();
	}
	

}
