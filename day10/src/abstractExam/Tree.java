package abstractExam;

public class Tree extends CountableParents{
	public Tree(String name, int number) {
		super(name,number);
	}
	
	public void beColored() {
		System.out.println(number + "그루"+name+"이 물들었습니다.");
	}
	@Override
	public void showCount() {
		System.out.println(name + "가"+number+"그루가 있습니다.");
	}

}
