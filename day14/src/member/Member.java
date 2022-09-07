package member;

public class Member {
	//회원ID - memberId, 회원이름-memberName, 회원나이-memberAge
	//필드
	private int memberId;
	private String memberName;
	private int memberAge;
	
	//생성자
	public Member(int memberId, String memberName, int memberAge) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.memberAge = memberAge;
	}
	
	//메서드
	
	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}
	public int getMemberId() {
		return memberId;
	}

	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberAge() {
		return memberAge;
	}
	public void setMemberAge(int memberAge) {
		this.memberAge = memberAge;
	}
	


	//정보 출력
	@Override
	public String toString() {
		return memberName + " 회원님의 아이디는 " + memberId + "나이는 " + memberAge + "살입니다.";
	}
	
	//**hashset은 반드시 들어가줘야함!**//
	@Override
	public int hashCode() {//중복된 아이디를 제거하기 위해서 hashcode의 return값이 주소값이 아닌 memberId값으로 바꿔줌!
		return memberId;
	}
	
	@Override
	public boolean equals(Object obj) {//원래는 equals는 hashcode인 주소값이 같은지를 물어보는 것이므로
		//재정의를 해줘야함!
		if(obj instanceof Member) {
			Member m = (Member)obj;//member타입으로 변화해줌!
			
			if(this.memberId == m.memberId) {
				return true;
			}
		}
		return false;
		
	}

}
