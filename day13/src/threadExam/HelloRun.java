package threadExam;

public class HelloRun implements Runnable{

	@Override
	public void run() {
		//hello 3번 실행
		for(int i=0; i<3; i++) {
			System.out.println("Hello");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
	}
	

}
