package methodExam;

public class CalculatorExam {

	public static void main(String[] args) {//중괄호: 선언
		// 2. 객체 생성
		Calculator cal = new Calculator();
		
		System.out.println(cal.add(5, 7));
		                    //"메서드를 호출"임. 이는 통으로 다 값임.(return값으로 받아오는 것이기 때문)
							//5,7은 매개변수 인수임
		System.out.println(cal.division(5, 2));
		System.out.println(cal.avg(4, 7));
		
		cal.powerOn();//void로 선언해 주었기 때문에 바로 써줘야함 print문으로 출력하려하면 error이 남
		//메서드를 호출한다. 
	}
//		substract(3,4);//같은 곳에서 호출할 때는 메서드 호출로 안써줘도됨!
//	}
//	public static int substract(int subnum1, int subnum2) {
//		return subnum1 - subnum2;
//		
//	}

}
