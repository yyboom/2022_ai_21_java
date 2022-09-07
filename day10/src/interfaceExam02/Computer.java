package interfaceExam02;

public class Computer implements Controllable{

	@Override
	public void turnOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("컴퓨터 전원을 끕니다.");
		
	}

	@Override
	public void repair() {
		System.out.println("컴퓨터을 공장에 수리 보내야 합니다.");
		
	}

	@Override
	public void reset() {
		System.out.println("컴퓨터을 초기화 시킵니다.");
		
	}

}
