package array;

import java.util.Arrays;

public class ArrayExam02 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (i+1) *10;
			
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		
		System.out.println(Arrays.toString(arr));

	}

}
