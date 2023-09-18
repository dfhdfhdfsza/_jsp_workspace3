package dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import domain.boardVO;
import domain.pagingVO;
import orm.DatabaseBuilder;

public class BoardDAOImpl implements BoardDAO 
{
	private static final Logger log=LoggerFactory.getLogger(BoardDAOImpl.class);
	//DB연결
	private SqlSession sql;
	private final String NS="BoardMapper.";//NS=NameSpace NameSpace.id 인식

	public BoardDAOImpl()
	{
		new DatabaseBuilder();
		sql=DatabaseBuilder.getFactory().openSession();
	}
	
	@Override
	public int insert(boardVO bvo) {
		log.info("insert check 3");
		int isOk=sql.insert(NS+"add",bvo);
		if(isOk>0)
			sql.commit();
		
		return isOk;
	}

	@Override
	public List<boardVO> list() {
		log.info("list check 3");
		return sql.selectList(NS+"list");
	}

	@Override
	public boardVO detail(int bno) {
		log.info("detail check 3");
		return sql.selectOne(NS+"detail",bno);
	}
	

	@Override
	public int edit(boardVO bvo) {
		log.info("detail check 3");
		int isOk=sql.update(NS+"edit",bvo);
		if(isOk>0)
			sql.commit();
		
		return isOk;
	}

	@Override
	public int remove(int bno) {
		log.info("remove check 3");
		int isOk=sql.delete(NS+"remove",bno);
		if(isOk>0)
			sql.commit();
		
		return isOk;
	}

	@Override
	public int viewup(int bno) {
		log.info("viewup check 3");
		int isOk=sql.update(NS+"viewup",bno);
		if(isOk>0)
			sql.commit();
		return isOk;
	}

	@Override
	public int getTotalCount(pagingVO pgvo) {
		
		return sql.selectOne(NS+"count",pgvo);
	}

	@Override
	public List<boardVO> getPageList(pagingVO pgvo) {
		
		return sql.selectList(NS+"plist",pgvo);
	}
	

}
