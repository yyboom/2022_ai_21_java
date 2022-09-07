package decimalFormatExam;

import java.text.DecimalFormat;

public class DecimalFormatExam {

	public static void main(String[] args) {
		DecimalFormat df01 = new DecimalFormat("#,###");//천단위 구분
		System.out.println(df01.format(1234567));
		System.out.println(df01.format(0));
		
		DecimalFormat df02 = new DecimalFormat("#,###.00");//소수점
		System.out.println(df02.format(123456));
		System.out.println(df02.format(4567.4567));//반올림되서 처리됨
	}

}
