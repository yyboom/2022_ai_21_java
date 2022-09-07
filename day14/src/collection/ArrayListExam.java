package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListExam {

	public static void main(String[] args) {
		//비교 예제
		String[] str = new String[] {"가", "나", "다", "라","마", "바","사"};
		str[1] = "바나나";//변경
		str[3] = null;//값만 없앨 수 있고 공간은 제거할 수 없음
		System.out.println(str.length);
		System.out.println(Arrays.toString(str));
		System.out.println();
		
		//List<String> listArr = new ArrayList<String>();=>가능
		ArrayList<String> listArr = new ArrayList<String>();//기본적으로 공간을 10개 확보해줌
		listArr.add("사과");
		listArr.add("딸기");
		listArr.add("바나나");
		listArr.add("포도");
		
		listArr.remove(0);
		listArr.remove("포도");
		listArr.add("천해향");
		listArr.add(0, "파인애플");
		
		System.out.println(listArr);
		System.out.println(listArr.size());
		
		listArr.clear();//모든 객체를 제거
		System.out.println(listArr);
		
		listArr.add("홍길동");
		listArr.add("김자바");
		listArr.add("박자바");
		listArr.add("이기자");
		
		System.out.println(listArr.get(0));//인덱스 위치의 데이터 정보 추출
		System.out.println(listArr.get(1));//파이썬에서 index랑 같은 것
		System.out.println(listArr.get(2));
		
		System.out.println(listArr.isEmpty());//비어있으면 true 아니면 false
	}

}
