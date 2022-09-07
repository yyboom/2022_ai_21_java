package member.list;
import java.util.HashSet;
import java.util.Iterator;

import member.*;
public class MemberHashSetInfo {
	private HashSet<Member> hashSet;
	
	public MemberHashSetInfo() {
		hashSet = new HashSet<Member>();
	}
	public void addMember(Member member) {
		hashSet.add(member);
	}
	public boolean removeMember(int memberId) {
		Iterator<Member> iter = hashSet.iterator();
		
		while(iter.hasNext()) {
			Member member = iter.next();
			int tempId = member.getMemberId();
			
			if(tempId == memberId) {
				hashSet.remove(member);
				return true;
			}
		}
		return false;
	}
	
	public void showInfo() {
		for(Member mem : hashSet) {
			System.out.println(mem);
		}
	}

}
