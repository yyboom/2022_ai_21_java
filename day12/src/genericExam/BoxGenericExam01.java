package genericExam;

public class BoxGenericExam01 {

	public static void main(String[] args) {
		BoxGeneric<Integer> bg = new BoxGeneric<Integer>();
		//T가 있는 곳 안에 class타입을 넣어줄 수도 있음!!
		bg.setRefVar(30);
		
		int val = bg.getRefVar();
		
	//	BoxGeneric<Car> bgCar = new BoxGeneric<Car>();=>형변환을 안해도 사용할 수 있음!!
	}

}
