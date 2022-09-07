package methodExam;

public class PrinterTest {

	public static void main(String[] args) {
//		int printNum= 70; // 지역변수
//		
//		//갹체 생성
//		Printer print = new Printer();
//		print.numOfPaper = 100;
//		print.printPaper(printNum);
//		
//		System.out.println("프린트 :" + printNum);
//		System.out.printf("남은 용지 :" + print.numOfPaper);
//
//
	

		Printer prt = new Printer(100);
		prt.prtPaper(150);
	}

}
