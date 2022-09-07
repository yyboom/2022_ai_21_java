package humanWeight;

import java.util.Scanner;

public class HumanExam {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수
		double changeWeight = 0.0;
		//객체생성
		Human cho = new Human();
		cho.setHeight(167.5);
		cho.setName("조윤영");
		cho.setWeight(49.8);
		
		
		
		System.out.println("변화된 몸무게를 입력하세요.");
		
		changeWeight = scan.nextDouble();
		
		if(cho.getWeight() < changeWeight) {
			cho.weightIncrease(changeWeight);
		}
		else if(cho.getWeight() > changeWeight) {
			cho.weightDecrease(changeWeight);
		}
		else {
			System.out.println("몸무게에 변화가 없습니다.");
		}
		
		

	}

}
