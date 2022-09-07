package array;

import java.util.Arrays;

public class ArrayExam01 {
	
	public static void main(String[] args) {
		int[] score = new int [4];//정수 자료형을 담을 수 있는 공간 4개를 heap영역에 만든다.
		
		score[0] = 10;
		score[1] = 20;
		score[2] = 30;
		score[3] = 40;
		
		System.out.println(score);
		
		System.out.println(score[0]);
		System.out.println(score[1]);
		System.out.println(score[2]);
		System.out.println(score[3]);
		
		System.out.println();
		
		for(int i=0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		//score 배열 객체의 내용을 확인만
		
		System.out.println(Arrays.toString((score)));
	}

}
