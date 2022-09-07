package methodExam;

public class ComputerExam {

	public static void main(String[] args) {
		// 객체생성
		Computer myCom = new Computer();
		
		int[] values = new int[] {1,2,3};
		//int[] values = {1,2,3};
		//int[] values = new int[3];
		//values[0]=1;
		//values[1]=2;
		//values[2]=3;
		
		//int result = myCom.sum(values);
		int result = myCom.sum(new int[] {1,2,3});
		
		System.out.println(result);
	}

}
