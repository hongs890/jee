package member;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : StudentServiceImpl.java
 * @story :
 */
public class MemberServiceImpl implements MemberService {
	
	MemberDAO dao = MemberDAO.getInstance();
	
	private static MemberServiceImpl instanceImpl = new MemberServiceImpl();
	
	private MemberServiceImpl() {}
	public static MemberServiceImpl getInstanceImpl() {
		return instanceImpl;
	}
	
	
	
	@Override
	public String regist(MemberBean mem) {
		String msg = "";
		String sql = "insert into member(id,pw,name,reg_date,ssn)"
				+ "values('"+mem.getId()+"','"+mem.getPw()+"','"+mem.getName()+"',"
						+ "'"+mem.getRegDate()+"','"+mem.getSsn()+"')";
		int result = dao.exeUpdate(sql);
		if (result==1) {
			msg = "회원가입 축하합니다.";
		}else{
			msg = "회원가입 실패";
		}
		return msg;
	}

	@Override
	public String show() {
		// 보기
		return null;
		
	}

	@Override
	public void update(String pw) {
		// 수정
	}

	@Override
	public String delete() {
		// 삭제
		return null;
	}

}

/*
 * String sqlCreate = "create table member("
				+ "id varchar2(20) primary key,"
				+ "pw varchar2(20),"
				+ "name varchar2(20),"
				+ "reg_date varchar2(20),"
				+ "ssn varchar2(10)"
				+ ")";
		String sqlDrop = "drop table member";
 * */
