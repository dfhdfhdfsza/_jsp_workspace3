package domain;

public class boardVO 
{
	private int bno;
	private String title;
	private String writer;
	private String content;
	private String regdate;
	private String moddate;
	private int viewcnt;
	
	//insert
	public boardVO(String title, String writer, String content) {
		super();
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	//edit
	public boardVO(int bno, String title, String writer, String content) {
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
	}
	
	//detail
	public boardVO(int bno, String title, String writer, String content, String regdate, String moddate, int viewcnt) {
		super();
		this.bno = bno;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.regdate = regdate;
		this.moddate = moddate;
		this.viewcnt = viewcnt;
	}
	//--------------------getter/setter-------------------------
	public int getBno() {
		return bno;
	}
	
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getRegdate() {
		return regdate;
	}
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
	public String getModdate() {
		return moddate;
	}
	public void setModdate(String moddate) {
		this.moddate = moddate;
	}
	
	public int getViewcnt() {
		return viewcnt;
	}
	public void setViewcnt(int viewcnt) {
		this.viewcnt = viewcnt;
	}
	@Override
	public String toString() {
		return "boardVO [bno=" + bno + ", title=" + title + ", writer=" + writer + ", content=" + content + ", regdate="
				+ regdate + ", moddate=" + moddate + "]";
	}
	

}
