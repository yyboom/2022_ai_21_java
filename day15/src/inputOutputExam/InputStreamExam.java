package inputOutputExam;

import java.io.FileInputStream;
import java.io.InputStream;

public class InputStreamExam {

	public static void main(String[] args) {
		
		try {
			InputStream is = new FileInputStream("c:\\test\\aa.txt");
			
			while(true) {
				int in = is.read();
				System.out.println("파일에 있는 자료 : " + in);
				
				if(in == -1) {
					break;
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		

	}

}
