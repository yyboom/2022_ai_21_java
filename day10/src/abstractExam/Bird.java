package abstractExam;

public class Bird extends CountableParents{
	//생성자
	public Bird(String name, int number) {
		super(name,number);
	}
	
	public void fly() {
		System.out.println(number + "가"+name+"가 날아갔습니다.");
	}
	
	@Override
	public void showCount() {
		System.out.println(name + "가"+number+"마리가 있습니다.");
	}

}
