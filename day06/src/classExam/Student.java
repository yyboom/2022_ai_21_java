package classExam;
//설계도(클래스)
public class Student {
	//필드 생성 : 접근제어자 자료형 필드명
	
	public String studentName;//학생 이름
	public int grade;//학년
	public int money;//가지고 있는 돈

	
	//생성자 : 접근제어자 클래스명 (){}
			//접근제어자 클래스명(매개변수...){}
	//생략하면 default값으로!
	public Student(String studentName, int grade, int money) {
		this.studentName = studentName;
		this.grade = grade;
		this.money = money;
	}
	
	
	//메서드 : 접근제어자 리턴타입 메서드명(){}
	//        접근제어자 티천타입 메서드명(매개변수...){}

	//학생이 버스를 선택한 경우
	public void takeBus(Bus bus) {
						//Bus 클래스에 대한 bus주소를 넘겨받는다
		//버스요금
		bus.take(1250);
		//남은 돈 계산
		this.money -= 1250;
	}
	
	public void takeSubway(Subway subway) {
		
		//지하철 요금
		subway.take(2350);
		//남은 돈 계산
		this.money -= 2350;
	}
	
	public void showInfo() {
		System.out.println(this.studentName + "의 남은 돈은" + this.money + 
				"입니다.");
	}
}
