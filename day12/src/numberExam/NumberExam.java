package numberExam;

import java.util.Scanner;

public class NumberExam {
	public static void main(String[] args) {
		// 컴퓨터가 랜덤으로 값을 산출하면, 우리가 그 값을 맞추기
		//우리가 입력한 값이 컴퓨터가 산출한 값보다 크면 "더 작은 값을 입력하세요."
		//우리가 입력한 값이 컴퓨터가 산출한 값보다 작으면 "더 큰 값을 입력하세요."
		//맞으면 "정답입니다."
		//컴퓨터 범위 1~100
		
		Scanner scan = new Scanner(System.in);
		
		int num = 1, count=0, usernum = 1;
		String user = null;
		boolean run =true;
		
		
		num = (int)(Math.random()*100);
		while(run) {
			System.out.println("1~100까지의 값을 입력하세요 : ");
			//보통은 이런 문장들은 message로 위에 처리해준 뒤 넣어주는게 더 좋음
			try {
				user = scan.next();
				usernum =Integer.parseInt(user);
				if(num < usernum) {
					System.out.println("더 작은 값을 입력하세요.");
					count = count + 1;//count는 중복되기 때문에 밖으로 빼서 줄여주는게 좋음
				}
				else if(num > usernum) {
					System.out.println("더 큰 값을 입력하세요.");
					count = count + 1;
				}
				else if(num == usernum){
					count = count + 1;
					System.out.println("정답입니다.");
					System.out.println(count+"만에 정답을 맞췄습니다.");
					run = false;
				}
			}
			catch(NumberFormatException e) {
				System.out.println("예외발생!");
				continue;
			}
			catch(Exception e) {
				System.out.println("예외발생");
				continue;
			}
		
		}

	}

}



