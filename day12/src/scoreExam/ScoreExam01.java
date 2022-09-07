package scoreExam;

public class ScoreExam01 {
	 public static <T> T findScore(T[] arr, String name){
			for(int i=0; i<arr.length; i++) {
				//앞에 있는 이름 3글자를 뽑으라는 의미!
				String find = arr[i].toString().substring(0,3);	
				if(find.equals(name)) {
					return arr[i];//찾는 이름이 존재할 때
				}
				
			}
			return null;//찾는 이름이 존재하지 않을 때
	  }
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
		 //이름을 입력하다 보면 입력을 안하고 넘어올 수 있음
		 String name = null;
		 name = args[0];//public static void main(String[] args 여기서 가져온것!
	
		 EnglishScore[] engScore = { new EnglishScore("홍길동", 70), new EnglishScore("우영우", 95),
				 new EnglishScore("정명석", 50), new EnglishScore("정우성", 70) };
		 MathScore[] matScore = { new MathScore("홍길동", 78), new MathScore("우영우", 85), new MathScore("정명석", 40),
				 new MathScore("정우성", 65) };
		 
		 try{
			 name = args[0];
		 }
		 catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println("입력한 값이 없습니다.");
			 System.out.println("다시 입력해주세요");
			 return;
		 }
		 catch(Exception e){
			 System.out.println("에러발생!");
			 return;
		 }



	  	// 메서드를 이용해서 찾기
	  	System.out.println("영어 최고 점수 = " + findBest(engScore));
	  	System.out.println("수학 최고 점수 = " + findBest(matScore));

	  	System.out.println("영어 점수 = " + findScore(engScore, name));
	  	System.out.println("수학 점수 = " + findScore(matScore, name));	
	

}

}
