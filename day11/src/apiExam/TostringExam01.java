package apiExam;

public class TostringExam01 {//재정의 해주는곳!!
	public String memberID;
	
	public TostringExam01(String memberID) {
		this.memberID = memberID;
	}
	@Override
	public String toString() {
		return "고객님의 아이디는" + memberID + "입니다.";
	}
	public boolean equals(Object obj) {
		if(obj instanceof TostringExam01) {
			TostringExam01 t = (TostringExam01)obj;
			if(this.memberID.equals(t.memberID)) {
				return true;
			}
		
		}
		return false;
	}
}
