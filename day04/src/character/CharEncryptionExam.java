package character;

public class CharEncryptionExam {

	public static void main(String[] args) {
		final int KEY_VALUE = 7; //문자를 암호화할때 사용, 암호화한 것을 다시 복호화하는데도 사용
		String password = "ghdrlfehd";//입력한 password
		String encryPwd = "";//암호화를 받을 것
		String decryPwd = null;//복호화를 받을 것
		
		//비밀번호를 가지고 암호화 - 유니코드 이용
		//비밀번호에서 한문자씩을 뽑아서 key값을 곱하거나 더하거나 빼거나 나누기도 가능.
		
		for (int i=0; i<password.length(); i++) {//시작을 0부터 시작하기에 =이 붙으면 안된다.
			encryPwd += (char)(password.charAt(i) * KEY_VALUE);
		}
		System.out.println(encryPwd);
		

		//복호화 : 암호화된 문자 / KEY_VALUE
		for(int i=0; i<encryPwd.length(); i++) {
			decryPwd += (char)(encryPwd.charAt(i)/KEY_VALUE);
			
		}
		System.out.println(decryPwd);
	}

}
