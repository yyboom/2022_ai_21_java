package abstractExam;

import java.security.cert.CertificateParsingException;

public class AbstractBirdExam {
	public static void main(String[] args) {
//		Tree tree01 = new Tree("자작나무", 5);
//		Tree tree02 = new Tree("은행나무", 3);
//		Tree tree03 = new Tree("단풍나무", 10);
//		
//		Bird bird01 = new Bird("뻐꾸기", 5);
//		Bird bird02 = new Bird("참새", 10);
//		Bird bird03 = new Bird("비둘기", 3);
		//길이를 줄이기 위해서 배열 선언!!
		CountableParents[] cParents = { 
				new Tree("자작나무", 5),
				new Tree("은행나무", 3),
				new Tree("단풍나무", 10),
				new Bird("뻐꾸기", 5),
				new Bird("참새", 10),
				new Bird("비둘기", 3)
		};
		
		for(CountableParents printChild : cParents) {
			printChild.showCount();
		}
		System.out.println();
		
		for(int i=0; i<cParents.length; i++) {
			//자식->부모->자식, instanceof
			if(cParents[i] instanceof Tree) {
				((Tree) cParents[i]).beColored();
			}
			else if(cParents[i] instanceof Bird) {
				((Bird) cParents[i]).fly();
			}
			
			
			
			
		}
	}

}
