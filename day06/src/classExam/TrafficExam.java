package classExam;

public class TrafficExam {

	public static void main(String[] args) {
		//객체생성
		Student cho = new Student("조윤영", 4, 20000);
		Bus bus17 = new Bus(17);
		Subway subwayRed = new Subway("신분당선");
		
		cho.takeBus(bus17);
		cho.showInfo();
		System.out.println();
		bus17.showInfo();
		System.out.println();
		cho.takeSubway(subwayRed);
		cho.showInfo();
		System.out.println();
		subwayRed.showInfo();
	}

}
