package singleExam;

public class SingletonMain {

	public static void main(String[] args) {
		//객체를 새롭게 생성하는 것이 아닌 힙에 이미 만들어논 것을 가져다 쓰는 것!
		SingletonTest obj1 = SingletonTest.getInstance();
		SingletonTest obj2 = SingletonTest.getInstance();
		
		if(obj1 == obj2) {//참조하는 주소값이 같은가(hashcode)
			System.out.println("같은 싱글톤 객체임");
			
		}
		else {
			System.out.println("다른 싱글톤 객체임");
		}

	}

}
