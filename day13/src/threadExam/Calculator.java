package threadExam;
//공유객체
public class Calculator {
	private int memory;

	public int getMemory() {
		return memory;
	}

	public synchronized void setMemory(int memory) {
		//여러 작업이 동시에 작동하고 있을 때 thread하나가 실행 후 그뒤것이 실행될수있도록
		//syncronized를 붙여서 같이 실행되어 원하지 않는 것이 나오지 못하도록 해줌!
		//누군가 쓰고 있으면 다른 것이 접근하지 못하도록 해주는 것임
		this.memory = memory;
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		
		}
		System.out.println(Thread.currentThread().getName() + ":" + this.memory);
	}
	


}
