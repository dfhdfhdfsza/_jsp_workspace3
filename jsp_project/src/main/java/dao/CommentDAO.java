package dao;

import java.util.List;

import domain.commentVO;

public interface CommentDAO {

	int post(commentVO cvo);

	List<commentVO> getList(int bno);

	int update(commentVO cvo);

	int remove(int cno);

	int removeAll(int bno);

}
