package eggDrop;

public class HeadOffice {
	//필드
	
	String sandwitch = null, salad = null, drink = null;
	int sandMoney = 0, salMoney = 0, drMoney = 0;
	private int materialMoney = 0, profit= 0;
	
	//생성자
	
	public HeadOffice() {
	}
	
	public HeadOffice(String sandwitch, String salad, String drink) {
		this.sandwitch = sandwitch;
		this.salad = salad;
		this.drink = drink;
	}

	//메서드
	
	//private에 대한 getter setter
	public int getMaterialMoney() {
		return materialMoney;
	}

	public void setMaterialMoney(int materialMoney) {
		this.materialMoney = materialMoney;
	}

	public int getProfit() {
		return profit;
	}

	public void setProfit(int profit) {
		this.profit = profit;
	}
	
	//default menu
	public void menuSee() {
		System.out.println("----------------------------");
		System.out.println("          sanswitch         ");
		System.out.println("햄 앤 치즈 길거리 토스트     5400원");
		System.out.println("베이컨 더블 치즈           5500원");
		System.out.println("아보 홀릭 샌드위치          6400원");
		System.out.println("갈릭 베이컨 치즈           5900원");
		System.out.println("            salad           ");
		System.out.println("리얼 에그 콥 샐러드         8900원");
		System.out.println("리얼 치킨 콥 샐러드         9200원");
		System.out.println("           drink            ");
		System.out.println("아메리카노                2900원");
		System.out.println("카페라떼                 3400원");
		System.out.println("바닐라라떼                3900원");
		System.out.println("다크초콜릿모카             4200원");
		
	}
	
	//물품을 골랐을때 => main으로 보내야 할듯!!
	public String answerCustomer() {
		String a = null;
		a = this.sandwitch + "샌드위치와 " + this.salad + "샐러드와 " + this.drink + "음료를 골랐습니다.";
		return a;
	}
	
	//물건종류 알려주기
//	public String answerSandwitch() {
//		//배열로 넣어주기
//	}
	
	
	//원가(가격의 85%)
	public double prCost() {
		double a = 0.00;
		a = (this.sandMoney  + this.salMoney + this.drMoney)*85/100;
		return a;
	}
	
	//회사 이윤(가격의 10%)
	public double companyCost() {
		double a = 0.00;
		a = (this.sandMoney  + this.salMoney + this.drMoney)*10/100;
		return a;
	}
	

}
