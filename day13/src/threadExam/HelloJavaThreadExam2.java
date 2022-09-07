package threadExam;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class HelloJavaThreadExam2 {

	public static void main(String[] args) {
		Thread hThread = new Thread(new HelloRun());
		hThread.start();
		
//		new Thread(new Runnable() {
//			//익명의 이너클래스를 이용
//			@Override
//			public void run() {
//				//hello 3번 실행
//				for(int i=0; i<3; i++) {
//					System.out.println("Java");
//					
//					try {
//						Thread.sleep(500);
//					} catch (InterruptedException e) {
//					}
//				}
//				
//			}	
//			//여기까지가 전부 ==Thread jThread랑 같은 것!!!!!
//			
//			
//			
//		}).start();
		
		Thread jThread = new Thread(new Runnable() {
			//익명의 이너클래스를 이용
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
			//여기까지가 전부 ==Thread jThread랑 같은 것!!!!!
			
			//Thread 풀 생성 =>반드시 start()전에 써야함! 
//			ExecutorService exec = Executors.newCachedThreadPool();
//			exec.execute(jThread);
			
			
		});
		
		jThread.start();
		
		
//		exec.shutdown(jThread);
		

	}

}
