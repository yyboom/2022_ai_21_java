package dao;

import java.util.ArrayList;
import java.util.List;

//게시물을 가져오는 것(list로 처리->Board중에서 가져올 것)
public class BoardDao {
	public static List<Board> getBoardList(){//Board클래스를 return타입으로 하겠다.
		List<Board> list = new ArrayList<Board>();
			list.add(new Board("제목1", "내용1"));
			list.add(new Board("제목2", "내용2"));
			list.add(new Board("제목3", "내용3"));
			
			return list;
	
	}

}
