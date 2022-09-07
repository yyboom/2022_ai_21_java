package repection;

public class LottoExam {

	public static void main(String[] args) {
		// Lotto 번호 출력 45까지, 6개
		//오늘의 로또 번호 : ~~~
		int k = 1;
		System.out.print("오늘의 로또 번호 : ");
		for(int i=1; i<=6; i++) {
				k = (int)(Math.random()*44) + 1;
				System.out.print(k + " ");
			
		}

	}

}
