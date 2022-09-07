package array;

import java.util.Scanner;

public class ArrayExam08 {
	
	public static void main(String[] args) {
		//단어 맞추기 게임
		String[][] words= {
				{"apple","사과"},
				{"book","책"},
				{"summer","여름"},
				{"computer","컴퓨터"}
			};
		//사용자 로부터 입력 받기 위해서
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<words.length; i++) {
			String tmp = null;
			
			System.out.println("Q" + (i+1) + ")"+words[i][0]+"의 뜻은");
			tmp = sc.nextLine();
			
			if(tmp.equals(words[i][1])) {
				System.out.println("정답입니다.");
			}
			else {
				System.out.println("오답입니다.");
				System.out.println("정답은"+words[i][1]+"입니다.");
			}
		}
		
	}

}
