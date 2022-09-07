package polymorExam;

class Fruits{
	String eat;
	int count;
	
	public Fruits() {
	
	}
	
	
	public Fruits(String eat, int count) {
		super();
		this.eat = eat;
		this.count = count;
	}


	public void color() {
		System.out.println("과일의 색상은 알록 달록 다양하다.");
	}
	public void kind() {
		System.out.println("나는 과일이다.");
	}
}

class Apple extends Fruits{
	@Override
	public void color() {
		super.color();//부모꺼도 호출하고 싶을때
		System.out.println("사과의 색깔이 빨강이다.");
	}
	public void kindApple() {
		System.out.println("나는 사과이다.");
	}
}

class Grape extends Fruits{
	@Override
	public void color() {
		super.color();//부모꺼도 호출하고 싶을때
		System.out.println("포도의 색상은 보라색이다.");
	}
}

class Kiwi extends Fruits{
	@Override
	public void color() {
		super.color();//부모꺼도 호출하고 싶을때
		System.out.println("키위의 색상은 녹색이다.");
	}	
}

public class PolyExam {

	public static void main(String[] args) {
		Fruits fruApple = new Apple();
		fruApple.color();//"사과의 색깔이 빨강이다."
		fruApple.kind();//"나는 과일이다."
		
		System.out.println();
		
		Apple appFru =(Apple) fruApple;
		appFru.color();//"사과의 색깔이 빨강이다."
		appFru.kindApple();//"나는 사과이다."
		
		System.out.println();
		
		Fruits[] fruArray = { new Apple(), new Grape(), new Kiwi()};
		//Fruits[] fruArray = new Fruits[]{ new Apple(), new Grape(), new Kiwi()};
		Fruits[] fruArray01 = new Fruits[3];
		fruArray01[0] = new Apple();
		fruArray01[1] = new Grape();
		fruArray01[2] = new Kiwi();
		
		for(Fruits arr : fruArray) {
			arr.color();
			System.out.println();
		}
		
		System.out.println();
		methodCall(new Apple());
		methodCall(new Grape());
		methodCall(new Kiwi());
	}
	public static void methodCall(Fruits fruCall) {
		fruCall.color();
		System.out.println();
		if(fruCall instanceof Apple) {
			Apple app = (Apple)fruCall;
			app.color();
		}
		else if(fruCall instanceof Grape) {
			Grape gra =( Grape)fruCall;
			gra.color();
		}
		else if(fruCall instanceof Kiwi) {
			Kiwi kiw = (Kiwi)fruCall;
			kiw.color();
		}
		else {
			System.out.println("자식 타입으로 형변환 불가");
		}
	}
}
