package threadExam;

public class HelloJavaThreadExam {

	public static void main(String[] args) {
		Thread hThread = new Thread(new HelloRun());
		hThread.start();
		
		Thread jThread = new Thread(new JavaRun());
		jThread.start();
		
//		//java 3번 실행//밖으로 다른 클래스로 빼서 처리해줄 수도 있음!!
//		for(int i=0; i<3;i++) {
//			System.out.println("Java");
//			
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//			}
//		}

	}

}
