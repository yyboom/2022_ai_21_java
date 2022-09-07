package interfaceExam;

public class InterCar01InherExam implements InterfaceCar01{
	//interface를 상속받을 때는 implements!!
	//interface는 다 미완성이기 때문에 다중구현이 가능하다!!
	//=>interface는 상속이 아닌 "구현"이라는 말을 씀
	//무조건 두개를 다 구현하지 않을 수 있음! 나중으로 미룰 수 있음

	@Override
	public void run() {
		System.out.println("그냥 달린다.");
		
	}


}
