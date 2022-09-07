package array;

import java.util.Arrays;

public class ArrayExam03 {

	public static void main(String[] args) {
		String[] name = new String[3];
		
		name[0] = "홍길동";
		name[1] = "김자바";
		name[2] = "이자바";
		
		//출력(for)
		
		for(int i=0; i < name.length; i++) {
			System.out.println(name[i]);
		}
		//Array이용
		System.out.println(Arrays.toString((name)));

	}

}
