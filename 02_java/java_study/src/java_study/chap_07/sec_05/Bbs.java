package java_study.chap_07.sec_05;

public class Bbs {
	private int num;
	private String title;
	private String content;
	private String writer;
		
	public Bbs() {
		super();
	}

	public Bbs(int num, String title, String content, String writer) {
		super();
		this.num = num;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

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

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	@Override
	public String toString() {
		return "Bbs [num=" + num + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
	}

	
}
