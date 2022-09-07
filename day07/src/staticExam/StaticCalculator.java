package staticExam;

class StaticCalExam{
	static double num1= 7.5;
	static int num2 = 10;
	static int  add(int x, int y) {
		return x+y;
	}
}
public class StaticCalculator {//class를여러개 선언할 수 있는데 그 와중에 class이름과 
	//같은 것에만 public을 붙일 수 있음
	public static void main(String[] args) {
		System.out.println(StaticCalExam.num1);
		System.out.println(StaticCalExam.num2);
		
		int result = StaticCalExam.add(5, 7);
		System.out.println(result);
		int result01 = multy(10,5);
		System.out.println(result01);
		//다른 패키지에 있는 것들 수업시간에 알려준거 다시보기//
		
	}
	public static int multy(int a, int b) {
		int result = a*b;
		return result;
	}
}



