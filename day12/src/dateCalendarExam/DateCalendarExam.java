package dateCalendarExam;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalendarExam {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);
		System.out.println();
		SimpleDateFormat sdf01 = new SimpleDateFormat("yyyy-MM-dd");
		String s = sdf01.format(now);
		System.out.println(sdf01.format(now));
		
		//추상클래스와 인터페이스는 객체를 생성할 수 없다.
		//Calendar.getInstance();를 이용해서 현재 시각을 가져오기
		Calendar calDate = Calendar.getInstance();
		System.out.println(calDate);
		System.out.println();
		
		SimpleDateFormat sdf02 = new SimpleDateFormat("yy년 MM월 dd일 H시 mm분 ss초");
		System.out.println(sdf02.format(now));
		
		
		System.out.println(calDate.get(Calendar.YEAR));
		System.out.println(calDate.get(Calendar.MONTH)+1);//월은 0월부터 시작하는 거라 +1을 해줘야함
		System.out.println(calDate.get(Calendar.DAY_OF_MONTH));
		System.out.println(calDate.get(Calendar.HOUR));
	}

}
