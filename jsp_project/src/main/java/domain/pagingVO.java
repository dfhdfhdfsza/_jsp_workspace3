package domain;

public class pagingVO 
{
	private int pageNo;//현재 페이지 번호
	private int qty; //한 페이지당 보여줄 게시글 수
	
	private String type;//검색타입
	private String keyword; //검색어
	
	public pagingVO()
	{
		this(1,10);
	}
	//list.jsp에서 페이지번호버튼을 눌렀을때
	//pageNo,qty를 받아오는 생성자
	public pagingVO(int pageNo,int qty)
	{
		this.pageNo=pageNo;
		this.qty=qty;
	}
	public int getPageStart()
	{
		return (pageNo-1)*qty;
	}
	
	//type이 여러개 들어올때 값을 배열로 리턴
	public String[] getTypeToArray()
	{
		//type이 null이면 새로운 배열을 생성해서 return
		//type이 null이 아니면 type을 split한 값을 리턴
		return this.type==null?new String[] {}:this.type.split("");
	}
	
	//--------------getter/setter----------------------------
	public int getPageNo() {
		return pageNo;
	}
	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	

}
