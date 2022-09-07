package methodExam;
//문제1)Printer 객체 생성
	//프린트 용지(numOfPaper)

//PrinterTest 실행 클래스
//프린트 용지: 100장 주입(초기값)
//프린트 -> 70장

//출력
//프린트 장수:70장(printPaper)
//남은 용지 :30장(메서드로 처리)

//문제2)용지가 부족?
//초기 기본 용지는 누구나 변경하지 못하게 numOfPaper=>private하게
//prtPaper 메서드
//출력할 때 남아 있는 용지가 없다면 용지가 없다고 알려줌
//남아 있는 용지보다 많은 출력을 요구하면 남아 있는 용지만큼 출력하고
//출력한 후 남아 있는 용지 매수를 알려 줌

//실행 클래스
//출력형태
//--2장 출력했습니다. 현재 98장 남았습니다.
//모두 출력하려면 용지가 ~~매 부족합니다.
//~장만 출력합니다.


public class Printer {
	//필드
//	private int numOfPaper ;//인스턴스 필드임. 
	//힙 영역에 객체가 만들어질 때만 인스턴스 변수가 의미 있음 
//	int paper = 70;
	//생성자
	//public Printer(){}인 기본 생성자를 컴퓨터가 자동으로 생성함
	//메서드
//	public int sub(int numOfPaper, int paper) {
//		int result = this.numOfPaper - this.paper;
//		return result;
//		
//	}
	//public void printPaper(int amount) {//인쇄 매수를 입력 받아 남은 용지 계산
//		numOfPaper -= amount; //남은 용지 = 기존용지 - 인쇄매수
//	}
//==============================================
	//문제2)
	//필드: 프린트에 있는 용지, 
	private int numOfPaper; // 인스턴스 필드(클래스 멤버 필드)
							// 힙 영역에 객체(인스턴스)를 생성하고 그 안에 작성
							//반드시 객체가 생성되어야 사용할 수 있다.
	//생성자: 용지를 초기화 ->객체를 초기화하고 사용할 수 있도록 준비하는 역할을 함
	//생성자는 클래스 이름과 같고 접근 지정자도 클래스와 같다. 리턴타입 없다.
	public Printer() {}
	public Printer(int numOfPaper) {//초기용지, 어떤 객체던지 다 받을 수 있음
		 //필드의 초기화 작업
		this.numOfPaper = numOfPaper;
	 }
	//메서드: 용지 없다, 용지 부족이 몇개, ~매 인쇄
	public void prtPaper(int amount) {//인쇄할 용지 매수, 지역변수
		//이 메서드에서만 실행한다.
	//반환할 값이 없을때 void를 쓴다.
		//용지 체크 -> 메세지 출력
		//용지 체크 : 0, 부족할 때, 남을 때
		if(numOfPaper == 0){
			System.out.println("인쇄할 용지가 없습니다.");
		}
		else if(numOfPaper < amount) {
			System.out.printf("모두 출력하려면 용지가 %d매 부족합니다." , amount );
			System.out.println(numOfPaper + "장만 출력합니다.");
			numOfPaper = 0;
		}
		else {
			numOfPaper -= amount;
			System.out.println(amount + "장 출력했습니다.");
			System.out.println("현재" + numOfPaper + "장 남아 있습니다.");
		}
	}	
	
	
	
	
	
	public int getNumOfPaper() {//외부 클래스에서 읽어 사용하려할 때 
		return numOfPaper;//현재 몇장 있는지 외부에서 확인할 때 유용
	}
	public void setNumOfPaper(int numOfPaper) {
		//외부로부터 용지를 추가하거나 할때(값 change될 때)
		this.numOfPaper = numOfPaper;
	}
	

}
