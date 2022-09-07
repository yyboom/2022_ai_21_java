package classMember;



public class ClassMember {
	//설계도(클래스) -> 객체생성 -> 객체사용
	
	//1. 클래스(필드, 생성자, 메서드)
	//학생 => 이름, 학년, 성적 -> 필드
	// 학생이 공부를 한다. -> 메서드
	
	//필드의 선언
	String name = "홍길동";
	int grade;
	double score;
	
//	public ClassMember() {
//		grade=3;
//		score=75.3;
	//기본생성자
	public ClassMember() {};
	//매개변수가 있는 생성자
	public ClassMember(String n, int grade, double s ) {
			              //매개변수임
		name = n;//name=필드, n=지역변수 (지역변수 이름과 필드 이름이 같으면 컴퓨터는 지역변수로 인식함)
		this.grade = grade;//힙 안에 있는 객체안에 grade이다 라는 것을 의마하는 걸로 this를 붙여줌
							//지역변수와 필드를 구분하기 위해 사용
		score = s;
	}
	public ClassMember(int gr, double sc) {
		grade=gr;
		score = sc;
		//ClassMember여러개 선언한것이 overloading
	}
							
						
				
			
	
}
