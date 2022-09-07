package polymorphismExam;

public class PolymorphismTest {

	public static void main(String[] args) {
		CastA ca = new CastA();
		System.out.println(ca.m);//3
		ca.showA();//A클래스
		
		CastB cb = new CastB();
		System.out.println(cb.m);//3
		System.out.println(cb.n);//4
		cb.showB();//B클래스
		
		//upcasting
		CastA uca = new CastB();
		System.out.println(uca.m);//3
//		System.out.println(uca.n);//에러가 남!!!!!
		
	}

}
