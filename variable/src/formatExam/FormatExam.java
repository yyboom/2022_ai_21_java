package formatExam;

public class FormatExam {

	public static void main(String[] args) {
//		double num = 756.32346;
		double su = 75.1;
		int kor = 90, eng = 80, mat = 95;
		String name = "홍길동";
		
		//System.out.println(num);
		//System.out.printf("%.2f" , num);

		
		// 이름 국어 영어 수학
		System.out.printf("%s\n중간고사 성적표\n",name);//%s에 들어갈 값은 name이다
		System.out.println("이름\t국어\t영어\t수학");
		System.out.println("=======================================");
		System.out.printf("%s\t%d\t%d\t%d\n", name, kor, eng, mat);
		System.out.println(name + "\t" + kor + "\t" + eng + "\t" + mat);
		
		System.out.println(su);
		System.out.printf("%f \n", su);//소수이하 6자리까지만 정확한 값, 
									   //7번째부터는 제대로 알려주지 않음
		System.out.printf("%.2f \n", su);//이게 조금 더 좋음
	}

}
