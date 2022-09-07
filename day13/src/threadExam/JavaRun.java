package threadExam;

public class JavaRun implements Runnable{
	@Override
	public void run() {
		//hello 3번 실행
		for(int i=0; i<3; i++) {
			System.out.println("Java");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}

}
