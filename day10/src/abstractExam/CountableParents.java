package abstractExam;

public abstract class CountableParents {
	//필드
	public String name;
	public int number;
	
	//생성자
	public CountableParents(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	//메서드
	public abstract void showCount();

}
