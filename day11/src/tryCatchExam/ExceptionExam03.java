package tryCatchExam;

import java.io.IOException;
import java.io.InputStreamReader;

public class ExceptionExam03 {

	public static void main(String[] args) {
		try(InputStreamReader is = new InputStreamReader(System.in);){//파일을 읽어서 예외처리를 하고 자동으로 닫아줌
			System.out.println(is.read());//is.read()일 경우 반드시 파일 처리가 끝난 후 is.close()를 처리해줘야 함
			//그러나 try with resource를 사용하면 자동으로 is.close()처리
		}
		catch (IOException e) {
			System.out.println("예외발생");
		}
	}

}
