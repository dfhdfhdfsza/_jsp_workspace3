package service;

import java.util.List;

import domain.memberVO;

public interface MemberService {

	int register(memberVO mvo);

	memberVO login(memberVO mvo);

	int lastLogin(String id);

	List<memberVO> list();

	int update(memberVO mvo);

	int remove(String id);

}
