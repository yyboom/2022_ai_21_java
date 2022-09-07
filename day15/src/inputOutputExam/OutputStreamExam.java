package inputOutputExam;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExam {

	public static void main(String[] args) {
		OutputStream os = null;
		
		try {
			os = new FileOutputStream("c\\test\\aa.txt");//파일에 있는 이름을 바꿔주는 역할을 함(output이기 때문)
			byte[] data ="ABC".getBytes();
			
			os.write(data);
			os.flush(); //=>buffer을 비우는 과정(남아있는 것까지 모두 제거한 후)
			os.close(); //outputstream을 자원을 해지하겠다.
		} catch (FileNotFoundException e) {
			
		} catch (Exception e) {
			
		} finally {
			if(os != null) {
				try {
					os.flush();
					os.close();
				} catch(IOException e) {
					
				}
			}
		}

	}

}
