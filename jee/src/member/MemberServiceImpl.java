package member;

import java.util.List;
import java.util.Map;

import bank.AccountService;
import bank.AccountServiceImpl;


/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : StudentServiceImpl.java
 * @story :
 */
public class MemberServiceImpl implements MemberService {
	
	MemberDAO dao = MemberDAO.getInstance();
	AccountService accService = AccountServiceImpl.getInstence();
	
	MemberBean session;
	private static MemberServiceImpl instanceImpl = new MemberServiceImpl();
	
	private MemberServiceImpl() {
		session = new MemberBean();
	}

	public MemberBean getSession() {
		return session;
	}
	
	public void logoutSession(MemberBean member) {
		if (member.getId().equals(session.getId()) && member.getPw().equals(session.getPw())) {
			session = null;
		}
	}
	
	public static MemberServiceImpl getInstanceImpl() {
		return instanceImpl;
	}
	
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		if (dao.insert(mem)==1) {
			msg = dao.findById(mem.getId()).getName();
		}
		return msg;
	}

	

	@Override
	public void update(MemberBean mem) {
		// 수정
		dao.update(mem);
		session = dao.findById(mem.getId());
	}

	@Override
	public String delete(String id) {
		String remove = "";
		if (dao.delete(id) == 1) {
			remove = "삭제 성공";
		}else {
			remove = "삭제 실패";
		}
		return remove;
	}
	
	
	public int count() {
		// TODO Auto-generated method stub
		return dao.count();
	}
	@Override
	public MemberBean findById(String id) {
	
		return dao.findById(id);
	}
	public List<?> list() {
		// TODO Auto-generated method stub
		return dao.list();
	}
	public List<?> findByName(String findName) {
		// TODO Auto-generated method stub
		return dao.findByName(findName);
	}
	@Override
	public List<?> findBy(String keyword) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Map<?, ?> map() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String login(MemberBean member) {
		String result = "";
			if (dao.login(member)) {
				session = dao.findById(member.getId());
				result = session.getName();
				accService.map();
			}else{
				result = "";
			}
		
		return result;
	}
	public String myAccount() {
		return session.toString();
	}
}