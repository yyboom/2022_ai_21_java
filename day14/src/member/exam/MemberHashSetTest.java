package member.exam;

import member.*;
import member.list.*;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSetInfo memberHash = new MemberHashSetInfo();
		
		//회원 객체 생성
		Member hong = new Member(2016251016, "홍길동", 23);
		Member choyun = new Member(2018251016, "조윤영", 25);
		Member choin = new Member(2020144016, "sister", 23);
		Member mom = new Member(1990131216, "mom", 53);
		Member dad = new Member(1990151313, "dad", 54);
		
		memberHash.addMember(hong);
		memberHash.addMember(mom);
		memberHash.addMember(dad);
		memberHash.addMember(choyun);
		memberHash.addMember(choin);
		
		Member hOverlap = new Member(2018251016, "이중복", 30);
		memberHash.addMember(hOverlap);
		//=>overriding해준 뒤에 삭제됨!
		
		memberHash.showInfo();
		boolean removeResult = memberHash.removeMember(hong.getMemberId());
		
		if(removeResult) {
			System.out.println(hong.getMemberId() + "회원을 삭제하였습니다.");
		}
		else {
			System.out.println(hong.getMemberId() + "회원이 존재하지 않습니다.");
		}
		System.out.println();

	}

}
