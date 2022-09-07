package inheritanceExam;

public class Student extends Human{
	//필드
	int studentNum;
	
	//생성자
	public Student(String name, int age, int studentNum) {
		super(name, age);
		this.studentNum = studentNum;
	}
	
	//메서드
	void goSchool() {
		System.out.println(name + "이 학교에 등교하고 있습니다.");
		
	}
	void studentNum() {
		System.out.println("등교하고 있는 학생의 학번은"+studentNum+"입니다.");
	}

}
