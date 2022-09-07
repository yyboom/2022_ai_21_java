package dao;

public class Board {
	//필드
	private String title = null;
	private String content = null;
	
	//생성자
	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}
	//메서드

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	

}
