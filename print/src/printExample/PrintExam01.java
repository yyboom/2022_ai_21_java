package printExample;

/*
  작성날짜: 2022.08.01
  작 성 자 : 조윤영
  부수적인 설명: 이 파일에 대한 간략한 소개
  				 파일의 내용을 왜, 어떻게 수정하게 되었는지(유지보수)

*/
public class PrintExam01 {

	public static void main(String[] args) {
		System.out.println("Hello Java!!");
//		System.out.println("Hello Java!!");
//		System.out.println("안녕!! 즐거운 시간!");
//		System.out.println();
//		//시스템이 가지고 있는 .출력장치로.괄호 안의 내용을 출력하고 행을 바꿔라
//		System.out.println("안녕!! 즐거운 시간1!");
//		System.out.println("안녕!! 즐거운 시간2!");
//		System.out.println("안녕!! 즐거운 시간3!"); //println은 자동으로 줄을 바꿔주는 기능이 있다. 
//		System.out.println("world!");//sysout을 적은 뒤 ctrl+spacebar을 쓰면 자동완성된다.
		
	    System.out.print("Hello4!!\n"); //print는 내용을 출력한 후 마지막에 줄바꿈을 하지 않음
	    System.out.print("30+50\n");//줄바꿈
	    System.out.print("안녕\"");//"출력
	    System.out.print("안녕\'");//'출력
	    System.out.print("안녕\\");//\출력


	    
	    System.out.printf("\t즐거운 시간");//포맷(서식문자)를 사용하여 출력하고자 할 때 사용, 줄바꿈을 하지 않음
	    					//tab
	}

}
