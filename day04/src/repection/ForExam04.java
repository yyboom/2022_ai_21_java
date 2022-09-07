package repection;

import java.util.Scanner;

public class ForExam04 {

	public static void main(String[] args) {
		// 숫자를 입력하세요 : 3
		// 3
		// 1 4 7
		//10 13 16
		//19 22 25
		
		Scanner scan = new Scanner(System.in);
		
		int num = 0, k=1;
		System.out.println("숫자를 입력하세요.");
		num = scan.nextInt();
		
		System.out.println(num);
		
		for(int i=1;i<=num;i++) { //행
			for(int j=1; j<=num ;j++) { //열
				System.out.printf("%d\t" , k);
				k = k + num;//입력한 숫자 만큼 값을 증가
			}
			System.out.println();//줄바꿈!!!!!
			
		}
		

	}

}
