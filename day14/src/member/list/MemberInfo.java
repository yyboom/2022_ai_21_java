package member.list;

import java.util.ArrayList;
import java.util.Iterator;

//Member클래스는 member 패키지에 있으므로 사용하려면 import해야 함
//MemberInfo클래스와 패키지가 다르기에 import하는 것임
import member.Member;

public class MemberInfo {
	private ArrayList<Member> arrayList;// arrayList 선언

	public MemberInfo() {
		// Member형으로 선언한 ArrayList생성
		arrayList = new ArrayList<Member>();
	}

	// ArrayList 회원 추가하는 메서드
	public void addMember(Member member) {
		arrayList.add(member);
	}

	// ArrayList 회원 제거하는 메서드 - memberId에 해당하는 회원을 제거
	public boolean removeMember(String memberName, int memberId) {
		

		// 1)회원이 존재
		for (int i = 0; i < arrayList.size(); i++) {
			Member member = arrayList.get(i);// get은 순차적으로 정리된 자료에서 자료 정보를 가져오는 것
			String tempName = member.getMemberName();
			int tempId = member.getMemberId();
			if (tempName.equals(memberName)) {// integer형이라서 == 쓸 수 있음
				// 가져온 정보에 있는 아이디와 매개변수로 넘어온 아이디를 비교해서
				// 둘이 일치하면
				if(tempId == memberId) {
					arrayList.remove(i);// 해당 아이디를 제거
					System.out.println(memberId + "아이디가 삭제되었습니다.");
					return true;
				}
			}
			System.out.println("존재하지 않는 Id입니다.");
			return false;
		
		}
		// 2) 회원이 존재하지 않는 경우
		System.out.println(memberId + "회원이 존재하지 않습니다.아이디를 확인해주세요.");
		 return false;
	}
		 
//	//방법2
//	public boolean removeMember(int memberId) {
//		Iterator<Member> iter = arrayList.iterator();//iterator()
//		
//		while(iter.hasNext()) {//요소가 있는지 찾기, 있으면 true반환
//			Member member = iter.next();
//			int tempId = member.getMemberId();
//			if(tempId == memberId) {
//				arrayList.remove(member);
//				return true;
//			}
//		}
		
//	}

	// 제거된 회원을 제외하고 남은 회원 목록을 출력하는 메서드
	public void showInfo() {
		for(Member mem : arrayList){//Member 타입에 mem을 넣고 
			System.out.println(mem);
//			System.out.println(mem.toString());
		}
	}
	
	//남은 회원수를 출력하는 메서드
	public void numInfo() {
		System.out.println(arrayList.size()+"명 있습니다.");
		
	}
}
