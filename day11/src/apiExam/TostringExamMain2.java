package apiExam;

public class TostringExamMain2 {

	public static void main(String[] args) {
		
		TostringExam01 toExam01 = new TostringExam01("a123");
		TostringExam01 toExam02 = new TostringExam01("a123");
		TostringExam01 toExam03 = new TostringExam01("b234");
		
		System.out.println(toExam01==toExam02);//false
		System.out.println(toExam01==toExam03);//false
		System.out.println(toExam01.equals(toExam02));//false 재정의가 안되어 있기 때문
		//object의 equals는 주소값(hashcode()이 같은지를 봄!!)
		//재정의를 해주었기 때문에 true로 나올 것!
		System.out.println(toExam01);//==toExam01.toString()
		//object클래스 toString() : 패키지명.클래스명.@hashcode()
	}

}
