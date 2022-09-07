package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListExam {

	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>();
		List<String> vectorList = new Vector<String>();
		List<String> linkedList = new LinkedList<String>();
		
		arrayList.add("사과");
		arrayList.add("포도");
		arrayList.add("딸기");
		System.out.println(arrayList.toString());
		System.out.println();
		
		vectorList.add("봄");
		vectorList.add("여름");
		vectorList.add("가을");
		vectorList.add("겨울");
		System.out.println(vectorList.toString());
		System.out.println();
		
		linkedList.add("자동차");
		linkedList.add("버스");
		linkedList.add("기차");
		System.out.println(linkedList.toString());
		System.out.println();
	}

}
