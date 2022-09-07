package inputOutputExam;

import java.io.FileInputStream;

public class FileInputStreamImage {

	public static void main(String[] args) {
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\조윤영\\OneDrive\\문서\\ai_21_java");
			
			int data =0;
			//이미지는 byte수를 더 크게 처리를 한번 더 해줘야함!
			byte[] readByte = new byte[100];
			while((data = fis.read(readByte))!= -1) {
				System.out.println(data);
			}
			fis.close();
		} catch(Exception e) {
			
		}

	}

}
