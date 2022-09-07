package exampleCar;

public class CarExam {

	public static void main(String[] args) {
		// 객체생성
		ExampleCar myCar = new ExampleCar();
		ExampleCar momCar = new ExampleCar("기아", "k7", "검정", 350);
		
		//객체사용
		System.out.println(myCar.company);
		//System.out.println(myCar.getColor());
		System.out.println();
		
		System.out.println(momCar.company);
		//System.out.println(momCar.getColor());

	}

}
