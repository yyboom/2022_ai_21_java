package interfaceExam02;

public class Tv implements RemoteControllable{

	@Override
	public void turnOn() {
		System.out.println("Tv 전원을 수동으로 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("Tv 전원을 수동으로 끕니다.");
		
	}

	@Override
	public void repair() {
		System.out.println("Tv를 수리합니다.");
		
	}

	@Override
	public void reset() {
		System.out.println("Tv를 초기화 시킵니다.");
		
	}

	@Override
	public void remoteOn() {
		System.out.println("Tv 전원을 외부에서 켭니다.");
		
	}

	@Override
	public void remoteOff() {
		System.out.println("Tv 전원을 외부에서 끕니다.");
		
	}

}
