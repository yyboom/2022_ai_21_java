package tryCatchExam;

public class ThrowsExam {

	public static void main(String[] args) {
		try {
			findClass();//메서드 호출
		}
		catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}//end of main
	public static void findClass() throws ClassNotFoundException{
		Class clazz = Class.forName("java.lang.String2");
	}

}//end of class
