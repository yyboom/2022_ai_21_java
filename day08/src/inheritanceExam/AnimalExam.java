package inheritanceExam;

public class AnimalExam {

	public static void main(String[] args) {
		Eagle eagle = new Eagle("두 눈", "부리", "연세","두 날개");
		Tiger tiger = new Tiger("부리부리한 두 눈", "주둥이", "조윤영");
		Fish fish = new Fish(null, null, null, null);
		Animal animal = new Animal(null, null, null);
		
		System.out.println(eagle.eye);//부모인 Animal class에서 받아왔기 때문에 가능
		System.out.println(tiger.mouth);
		
		eagle.fly();
		eagle.sleep();
		tiger.sleep();
		tiger.run();

	}

}
