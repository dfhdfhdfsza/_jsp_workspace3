package handler;

import domain.pagingVO;

public class PagingHandler 
{
	private int startPage;//현재 페이지그룹에서 보여줄 시작 페이지 번호
	private int endPage;//현재 페이지그룹에서 보여줄 끝 페이지 번호
	private int realEndPage; //실제 전체 페이지 끝 번호
	private boolean prev,next;//이전,다음페이지그룹 존재 여부
	
	private int totalCount;
	private pagingVO pgvo;
	
	public PagingHandler(pagingVO pgvo,int totalCount)
	{
		//list.jsp에서 페이지번호버튼을 누르면 pageNo와 qty를 받아 생성된
		//pagingVO와 totalCount를 boardController를 통해 받아온다
		this.pgvo=pgvo;
		this.totalCount=totalCount;
		
		//1~10까지는 10, 11~20=20,21~30=30
		//페이지번호/한 화면 게시글수(10) * 한 화면의 게시글 수(10)
		//ex) 1/10 = 0.1 (ceil) -> 1*10=10
		//2/10 = 0.2 (ceil) -> 1*10=10
		//11/10 = 1.1 (ceil) -> 2*10=20
		this.endPage=(int)Math.ceil(pgvo.getPageNo()/(double)pgvo.getQty())*pgvo.getQty();
		this.startPage=this.endPage-9;
		
		//게시글 수 11개 =>페이지 1,2
		//전체 게시글 수/한 화면의 게시글 수
		//나머지가 생기면 무조건 1페이지 더 생겨야 함.
		//페이지네이션의 마지막 페이지
		//ex) totalCount=42,qty=10
		// 42/10 = 4.2 (ceil)-> realEndPage=5
		this.realEndPage=(int)Math.ceil((totalCount)/(double)pgvo.getQty());
		//ex)realEndPage=7 endPage = 1/10 = 0.1 (ceil) -> 1*10=10 일때
		//endPage는 realEndPage를 넘으면 안되므로 endPage에 realEndPage를 대입
		if(this.realEndPage<this.endPage)
			this.endPage=this.realEndPage;
		//startPage는 1부터 qty값 만큼 증가함
		//startPage가 1+qty*n의 값이면 n번째 페이지그룹이므로
		//이전페이지그룹버튼을 누를수 있게 활성화할 prev변수를 true로 만들수 있게 구현
		this.prev=this.startPage>1;//존재여부
		this.next=this.endPage<this.realEndPage;
		//endPage가 realEndPage보다 작으면 다름페이지그룹이 존재함
	}
	//--------------------------getter/setter--------------------------

	public int getStartPage() {
		return startPage;
	}

	public void setStartPage(int startPage) {
		this.startPage = startPage;
	}

	public int getEndPage() {
		return endPage;
	}

	public void setEndPage(int endPage) {
		this.endPage = endPage;
	}

	public int getRealEndPage() {
		return realEndPage;
	}

	public void setRealEndPage(int realEndPage) {
		this.realEndPage = realEndPage;
	}

	public boolean isPrev() {
		return prev;
	}

	public void setPrev(boolean prev) {
		this.prev = prev;
	}

	public boolean isNext() {
		return next;
	}

	public void setNext(boolean next) {
		this.next = next;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}

	public pagingVO getPgvo() {
		return pgvo;
	}

	public void setPgvo(pagingVO pgvo) {
		this.pgvo = pgvo;
	}
	

}
