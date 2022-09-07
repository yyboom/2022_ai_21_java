package arrayExam;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num = 1, count=0, usernum = 1;
		String user = null;
		boolean run =true;
		int[] arr = new int[10];
		
		while(run) {
			System.out.println("정수를 입력하세요.");
			user = scan.next();
			if(user == "q") {
				System.out.println("종료.");
				break;
			}
			try {
				for(int i=0; i<arr.length; i++) {
					user = scan.next();
					usernum =Integer.parseInt(user);
					arr[i] = usernum;
				}
				System.out.println(Arrays.toString(arr));
			}

			catch( Exception e) {
				System.out.println("에러입니다");
				run = false;
			}
		}

	}

}
