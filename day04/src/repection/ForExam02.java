package repection;

public class ForExam02 {

	public static void main(String[] args) {
		// 2단
		//========
		//2 * 1 = 2
		//2 * 2 = 4
		//2 * 3 = 6
		//2 * 4 = 8
		//...
		//2 * 9 = 18
		
		//3단
		//3 * 1 = 3
		//3 * 2 = 6
		//...
		//3 * 9 = 27
		//...
		//9단까지
		int i = 1, k=1;
		for(i=2; i<=9; i++) {
			for(k=1; k<=9; k++) {
				System.out.println(i + "*" + k +" = " + (i*k));
			}
		}

	}

}
