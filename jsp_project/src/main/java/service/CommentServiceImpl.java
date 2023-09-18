package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.CommentDAO;
import dao.CommentDAOImpl;
import domain.commentVO;

public class CommentServiceImpl implements CommentService 
{

	private static final Logger log=LoggerFactory.getLogger(CommentServiceImpl.class);
	private CommentDAO cdao;
	
	public CommentServiceImpl()
	{
		cdao=new CommentDAOImpl();
	}

	@Override
	public int post(commentVO cvo) {
		log.info("post check2");
		return cdao.post(cvo);
	}

	@Override
	public List<commentVO> getList(int bno) {
		return cdao.getList(bno);
	}

	@Override
	public int modify(commentVO cvo) {
		log.info("modify check 2");
		return cdao.update(cvo);
	}

	@Override
	public int remove(int cno) {
		// TODO Auto-generated method stub
		return cdao.remove(cno);
	}

	@Override
	public int removeAll(int bno) {
		// TODO Auto-generated method stub
		return cdao.removeAll(bno);
	}
}
