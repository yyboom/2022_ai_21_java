package apiExam;


public class StringExam {
	
	public static void main(String[] args) {
		
		String str1 = "    Hello java!!   ";
		String str2 ="        java is fun!";
		String str3 = String.valueOf(20)//문자열로 변환
;		
		System.out.println(str1.charAt(3));//1
		System.out.println(str1.toLowerCase());
		System.out.println(str1.toUpperCase());
		System.out.println(str2.trim());//앞뒤 공백 제거
		System.out.println(str1.length());
		System.out.println(str1.indexOf("j"));
		System.out.println(str1.replace("java", "자바"));
		System.out.println(str1.substring(0,3));
		System.out.println(str3);
		
	}

}
