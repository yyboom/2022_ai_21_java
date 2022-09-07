package castingExam;

public class CastingExam {

	public static void main(String[] args) {
		//자동형변환
		System.out.println(15/2);//7
		System.out.println(15/2.0);//7.5
		
		//강제형변환
		System.out.println(15/(double)2);//7.5
		System.out.println((int)8.43+2.3);//10.3
		System.out.println((int)(8.43+2.3));//10
		
		//3.45 + 7.63 = 10
		System.out.println((int)3.45 + (int)7.63);//11
		System.out.println((int)(3.45 + 7.63));//11
		
		//문자열로
		System.out.println("1"+3);//13
		System.out.println("가" + 2 + 7);//가27
		System.out.println("5" + 2 + 7);//527
		System.out.println("5" + (2 + 7));//59
		System.out.println(2 + 7 + "나");//9나
		System.out.println(2 + 7 + "5");//95
		
		//정수값으로
		//System.out.println((int)"3" + 7);//error
		//클래스 형변환 : 클래스 타입으로 형변환
		System.out.println(Integer.parseInt("3") + 7);//10

	}

}
