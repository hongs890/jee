package member;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : StudentServiceImpl.java
 * @story :
 */
public class MemberServiceImpl implements MemberService {
	MemberBean student;
		
	@Override
	public void registStudent(String id, String pw, String name, String ssn) {
		// id, 비번, 이름, 주민등록번호
		student = new MemberBean(id, pw, name, ssn);
	}

	@Override
	public String showStudent() {
		// 보기
		return student.toString();
		
	}

	@Override
	public void updateStudent(String pw) {
		// 수정
		student.setPw(pw);
	}

	@Override
	public String deleteStudent() {
		// 삭제
		student = null;
		return "정보를 삭제하였습니다";
	}

}
