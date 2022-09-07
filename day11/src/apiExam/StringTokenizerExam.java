package apiExam;
import java.util.StringTokenizer;
public class StringTokenizerExam {

	public static void main(String[] args) {//문자를 분리하고 싶을때 주로 사용
		// 토큰(token) : 분리한 문자열
		// 			공백이나 줄 바꿈 구분자를 사용해서 문자열 분리
		//			기본 구분자:공백, 탭, 줄바꿈, ...
		String str = "hello, java!!, java is fun!";
		
		StringTokenizer sToken = new StringTokenizer(str, ", ");
		//,로 구분해서 파싱(나눈) 한 후 StringTokenize객체를 생성
		
		System.out.println("구분한 문자열 개수 = " + sToken.countTokens());//토큰의 개수를 구해줌
		
		//구분 문자를 출력
		while(sToken.hasMoreElements()) {//남아 있는 토큰(쪼개진 문자열)이 있는지 여부를 반환
			//토큰이 있는 동안은 true
			//nextToken() : 다음 토큰을 꺼내 온다.
			System.out.print("["+sToken.nextToken()+"]");//토큰이 남아 있을 때까지 다음 토큰을 꺼내어 출력
			
		}
	}

}
