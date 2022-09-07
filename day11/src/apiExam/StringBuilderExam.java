package apiExam;

public class StringBuilderExam {

	public static void main(String[] args) {
		// String 은 문자열을 변경할 수 없다. 변경하려면 다시 객체를 생성한다.
		String str = "java";
		System.out.println(str.hashCode());
		
		str = str + "!!";
		System.out.println(str.hashCode());//위의 것이랑 hashcode가 다름!!
		System.out.println();
		
		//Stringbuilder 이용해서 문자열 추가 변경 제저가 자유로움
		//새로운 객체를 생성하지 않고 버퍼의 크기를 조정해서 추가/ 변경/ 삭제를 함
		StringBuilder strBuil = new StringBuilder("hi java");
		System.out.println(strBuil.hashCode());
		
		strBuil = strBuil.append("안녕 자바");
		System.out.println(strBuil.hashCode());
		System.out.println(strBuil);
		strBuil = strBuil.insert(1, "즐거운 자바시간").replace(4, 6, "Good bye");
		//insert한 뒤에 다시 replace해줘도 됨!
		System.out.println(strBuil.hashCode());
		System.out.println(strBuil);

	}

}
