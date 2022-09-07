package member.exam;

import member.list.*;
import member.*;
import java.util.Scanner;

public class MemberTest {

	public static void main(String[] args) {
		MemberInfo memberInfo = new MemberInfo();
		Scanner scan = new Scanner(System.in);
		String putName = null;
		int putNumber = 0;

		// 회원 객체 생성
		Member hong = new Member(2016251016, "홍길동", 23);
		Member choyun = new Member(2018251016, "조윤영", 25);
		Member choin = new Member(2020144016, "sister", 23);
		Member mom = new Member(1990131216, "mom", 53);
		Member dad = new Member(1990151313, "dad", 54);


		// 회원객체를 리스트목록(MemberInfo)에 담기
		memberInfo.addMember(hong);
		memberInfo.addMember(mom);
		memberInfo.addMember(dad);
		memberInfo.addMember(choyun);
		memberInfo.addMember(choin);

		

		// 전체 회원목록 출력해 보기
		// memberInfo.showInfo();
		putName = scan.next();
		putNumber = scan.nextInt();

		// 회원 삭제
		memberInfo.removeMember(putName, putNumber);

		memberInfo.showInfo();
		memberInfo.numInfo();

	}

}
