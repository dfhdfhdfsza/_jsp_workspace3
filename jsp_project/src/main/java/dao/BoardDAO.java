package dao;

import java.util.List;

import domain.boardVO;
import domain.pagingVO;

public interface BoardDAO {

	int insert(boardVO bvo);

	List<boardVO> list();

	boardVO detail(int bno);

	int edit(boardVO bvo);

	int remove(int bno);

	int viewup(int bno);

	int getTotalCount(pagingVO pgvo);

	List<boardVO> getPageList(pagingVO pgvo);

}
