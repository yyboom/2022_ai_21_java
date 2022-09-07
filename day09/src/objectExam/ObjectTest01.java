package objectExam;

class Dog{//여기다가 class를 쓰면 default가 되어서 상속을 할 수 없음.
	//인스턴스 필드
	int age = 3;
	String name = "방울이";
	
}
class Cat{
	int age = 5;
	String name = "냥이";
	//생성자
	public Cat() {}
	public Cat(String name) {
		super();
		this.name = name;
	}
	//메서드
	@Override//toString 재정의
	public String toString() {
		String result = null;
		result = "우리집 고양이 이름은 "+this.name + "나이는"+this.age+"살";
		return result;
	}


	@Override//equals 재정의
	public boolean equals(Object obj) {
		//obj가 Cat으로 형변환 시킬 수 있는지 확인해야함
		//instanceof 연산자: 변수가 해당 타입이나 자식타입이라면 true변환,
		//그렇지 않으면 false
		//객체를 참조하는 변수 instanceof 클래스 이름 혹은 인터페이스 이름
		
		if(obj instanceof Cat) {
			if(this.name ==((Cat) obj).name) {//형변환을 시켜준 뒤 그것의 name이 같은지를 비교해줘야함!
				return true;
			}//안쪽 if
		}//바깥쪽 if
		return false;
	}
}
class Parrot{
	//필드
	int age = 1;
	String name;
	//셍성자
	public Parrot(String name) {
		this.name = name;
	}
	//메서드
	@Override
	public String toString() {

		return "앵무새 이름 : " + this.name;
	}
	
	
	
}

public class ObjectTest01 {

	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		
		System.out.println(dog);
		System.out.println(dog.toString());
		System.out.println();
		System.out.println(cat);
		System.out.println(cat.toString());
		
		String str = new String("홍길동");
		String str01 = "홍길동";
		String str02 = "홍길동";
		System.out.println(str);
		
		Parrot par01 = new Parrot("앵순이");
		Parrot par02 = new Parrot("앵순이");
		
		System.out.println(par01 == par02);
		System.out.println(par01.equals(par02));//재정의를 다시 하지 않았기에 주소값을 비교해버리게 됨
		//=>false가 나올 것
		//Object 클래스의 equals() 참조하는 주소가 같은지 비교(==)
		//Parrot 클래스 재정의 안해 놓음 => equals()가 참조 주소가 같은지를 비교한 것임
		System.out.println();
		
		System.out.println(str == str02);//false(==참조 주소 비교)
		System.out.println(str.equals(str02));//true(참조 주소가 가리키는 곳의 값을 비교)
		//String 클래스는 toString(), equals()메서드를 재정의 헤 놓음
		//equals() => 값을 비교하는 것으로 재정의
		System.out.println();
		
		Cat cat01 =  new Cat("야옹이");
		Cat cat02 = new Cat("야옹이");
		System.out.println(cat01.equals(cat02));//true일 것
		//equals메서드를 재정의 해 놓았기 때문!!

	}

}
