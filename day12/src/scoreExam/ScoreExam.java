package scoreExam;

public class ScoreExam {
	//최고 점수인 학생의 점수
	//여기서 수학, 과학 등등 더 늘리고 싶을때 generic을 사용하는 것!!
	//generic으로 넘겨받고 싶음 세더드 만큼 써줌! <T extends Comparable>
	//=>클래스가 생성되기만 하면 메서드를 generic으로 만들어서 하나로 묶어서 사용 가능!
	public static <T extends Comparable> T findBest(T[] val) {
		T best = val[0];
		for(int i=0; i<val.length; i++) {
			if(best.compareTo(val[i]) <0) {
				best = val[i];//EnglishScore 클래스에 있는 override된 것을 가지고 오는 것!
			}
		}
		return best;
	}

	public static void main(String[] args) {
		// 메서드 2개 ( 최고점수를 찾는 메서드, main메서드)
		EnglishScore[] engScore = { 
				new EnglishScore("홍길동", 70),
				new EnglishScore("조윤영", 95),
				new EnglishScore("우영우", 25),
				new EnglishScore("조인순", 85)
		};
		MathScore[] matScore = { 
				new MathScore("홍길동", 75),
				new MathScore("조윤영", 90),
				new MathScore("우영우", 40),
				new MathScore("조인순", 91)
		};

		//메서드를 이용해서 찾을것!
		System.out.println("영어의 최고 점수 : " + findBest(engScore));
		System.out.println("수학의 최고 점수 : " + findBest(matScore));

	}

}
