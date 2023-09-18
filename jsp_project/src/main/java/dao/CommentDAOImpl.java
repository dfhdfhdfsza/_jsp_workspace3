package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.commentVO;
import orm.DatabaseBuilder;



public class CommentDAOImpl implements CommentDAO 
{
	private static final Logger log=LoggerFactory.getLogger(CommentDAOImpl.class);
	private SqlSession sql;
	private final String NS="CommentMapper.";
	private int isOk;
	
	public CommentDAOImpl() 
	{
		new DatabaseBuilder();
		sql=DatabaseBuilder.getFactory().openSession();
	}

	@Override
	public int post(commentVO cvo) {
		isOk=sql.insert(NS+"add",cvo);
		if(isOk>0)
			sql.commit();
		
		return isOk;
	}

	@Override
	public List<commentVO> getList(int bno) {
		return sql.selectList(NS+"list",bno);
	}

	@Override
	public int update(commentVO cvo) {
		log.info("modify check 3");
		isOk=sql.update(NS+"update",cvo);
		if(isOk>0)
			sql.commit();
		
		return isOk;
	}

	@Override
	public int remove(int cno) {
		isOk=sql.delete(NS+"del",cno);
		if(isOk>0)
			sql.commit();
		return isOk;
	}

	@Override
	public int removeAll(int bno) {
		isOk=sql.delete(NS+"delall",bno);
		if(isOk>0)
			sql.commit();
		return isOk;
	}
	
	
}
