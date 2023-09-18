package service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import dao.MemberDAO;
import dao.MemberDAOImpl;
import domain.memberVO;

public class MemberServiceImpl implements MemberService 
{
	private static final Logger log=LoggerFactory.getLogger(MemberServiceImpl.class);
	private MemberDAO mdao;
	
	public MemberServiceImpl()
	{
		mdao=new MemberDAOImpl();
	}
	@Override
	public int register(memberVO mvo) 
	{
		log.info("register check 2");
		return mdao.register(mvo);
	}
	@Override
	public memberVO login(memberVO mvo) {
		log.info("login check 2");
		return mdao.login(mvo);
	}
	@Override
	public int lastLogin(String id) {
		log.info("lastlogin check 2");
		return mdao.lastlogin(id);
	}
	@Override
	public List<memberVO> list() {
		log.info("list check 2");
		return mdao.list();
	}
	@Override
	public int update(memberVO mvo) {
		log.info("update check 2");
		return mdao.update(mvo);
	}
	@Override
	public int remove(String id) {
		log.info("remove check 2");
		return mdao.remove(id);
	}

}
