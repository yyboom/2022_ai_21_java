package classExam;

public class Bus {
	//필드
	public int busNumber;//버스 노선
	public int passengerCount;//버스 승객수
	public int money;//버스수입
	
	//생성자
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
	}
	
	//메서드
	//버스 수입
	public void take(int money) {
		this.money += money;
		this.passengerCount ++ ;
	}
	public void showInfo() {
		System.out.println("버스 " + this.busNumber + "번의 승객은" + 
				this.passengerCount + "명 이고 수입은" + 
				this.money + "입니다.");
	}

}
