package genericExam;

public class BoxGeneric <T>{
	private T refVar;

	public T getRefVar() {
		return refVar;
	}

	public void setRefVar(T refVar) {//앞에서 object자리에 T가 온 것!
		//이T자리에다가 자료타입을 넣어주라는 의미임!!
		this.refVar = refVar;
	}


	
	

}
