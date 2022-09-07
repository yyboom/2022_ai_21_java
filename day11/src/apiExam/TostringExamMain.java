package apiExam;

public class TostringExamMain {

	public static void main(String[] args) {
		
		TostringExam01 toExam01 = new TostringExam01("a123");
		TostringExam01 toExam02 = new TostringExam01("a123");
		TostringExam01 toExam03 = new TostringExam01("b234");
		
		String str1 = "홍길동";
		String str2 = "홍길동";
		String str3 = new String("홍길동");
		
		System.out.println(toExam01==toExam02);//false
		System.out.println(toExam01==toExam03);//false
		System.out.println(toExam01.equals(toExam02));//false 재정의가 안되어 있기 때문
		//object의 equals는 주소값(hashcode()이 같은지를 봄!!)
		System.out.println();
		System.out.println(str1==str2);//true
		System.out.println(str1==str3);//false
		System.out.println(str1.equals(str3));//true
		System.out.println();
		System.out.println(toExam01);//==toExam01.toString()
		//object클래스 toString() : 패키지명.클래스명.@hashcode()
		System.out.println(str1);//==str1.toString()
		//String 클래스는 toString()재정의 해 놓음
	}

}
