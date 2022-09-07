package scoreExam;

public class MathScore implements Comparable<MathScore>{//영어성적을 받아서 처리할 것이다!
	//영어 성적을 비교하는 클래스임
	//-성적을 비교
	//-이름과 점수를 출력할 수 있도록 toString()
	
	//필드
	String name;
	int score;
	
	//생성자
	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}
	//메서드
	@Override
	public String toString() {
		return name + "," + score;
	}
	@Override
	public int compareTo(MathScore o) {//넘겨받은 값을 비교하고 싶을 때 쓰는 것!
		//비교시에 리턴 값은 무조건 -1,0,1세개중에 하나로 설정해야함!
		if(this.score > o.score) {
			return 1;
		}
		else if(this.score < o.score) {
			return -1;
		}
		else {
			return 0;
		}
	}

}
