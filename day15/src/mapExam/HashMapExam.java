package mapExam;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapExam {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String maxId = null; //최고 점수를 받은 아이디 저장
		int maxScore = 0; //최고점수
		int totalScore = 0; //점수의 합계
		int avg = 0;
		
		//평균점수 : ??
		//최고점수 : ??
		//최고점수를 받은 아이디 : ???
		
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		for(Map.Entry<String, Integer> entry : entrySet) {
			if(entry.getValue() > maxScore) {
				maxId = entry.getKey();
				maxScore = entry.getValue();			
			}
			totalScore += entry.getValue();
		}
		avg = totalScore / map.size();
		
		System.out.println("평균점수 : "+avg);
		System.out.println("최고점수 : "+maxScore);
		System.out.println("최고점수를 받은 아이디 : "+maxId);
	}

}
