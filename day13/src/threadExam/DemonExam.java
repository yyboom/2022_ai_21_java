package threadExam;

public class DemonExam {

	public static void main(String[] args) {
		//Demon 실행 전
//		AutoSaveThread autoSave = new AutoSaveThread();
//		autoSave.start();
		
		//Demon 실행 후
		AutoSaveThread autoSave = new AutoSaveThread();
		autoSave.setDaemon(true);//Demon을 실행한다 true일때 실행함 
		//=>autoSave에 대해서 Demon을 실행한다
		autoSave.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		System.out.println("메인 쓰레드를 종료");

	}

}
