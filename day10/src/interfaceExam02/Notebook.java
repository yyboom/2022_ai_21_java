package interfaceExam02;

public class Notebook implements Controllable{
	public void showNote() {
		System.out.println("노트북만 가지고 있는 메서드 입니다.");
	}
	
	@Override
	public void turnOn() {
		System.out.println("노트북 전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("노트북 전원을 끕니다.");
		
	}

	@Override
	public void repair() {
		System.out.println("노트북을 공장에 수리 보내야 합니다.");
		
	}

	@Override
	public void reset() {
		System.out.println("노트북을 초기화 시킵니다.");
		
	}

}
