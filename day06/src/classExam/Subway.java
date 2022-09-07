package classExam;

public class Subway {
	//필드
	public String subwayNumber;//버스 노선
	public int passengerCount;//버스 승객수
	public int money;//버스수입
	
	//생성자
	public Subway(String subwayNumber) {
		this.subwayNumber = subwayNumber;
		
	}
	
	//메서드
	//지하철 수입
	public void take(int money) {
		this.money += money;
		this.passengerCount ++ ;
	}
	public void showInfo() {
		System.out.println("지하철 " + this.subwayNumber + "의 승객은" + 
				this.passengerCount + "명 이고 수입은" + 
				this.money + "입니다.");
	}

}
