/**
 * 
 */
package member;

import javax.swing.JOptionPane;

/**
 * @date  : 2016. 6. 16.
 * @author: 배근홍
 * @file  : SchoolController.java
 * @story :
 */
public class MemberController {
	/**
	 * 1. 등록 (SSN,아이디,비밀번호,이름) // SSN에서 성별 추출
	 * regDate는 등록하는 순간의 일자가 자동으로 입력
	 * 한빛학원, 이름 : 홍길동, ID, 남, 나이, 등록일자 // 비밀번호는 출력되지 않음 
	 * 2. 조회 
	 * */
	public static void main(String[] args) {
		MemberServiceImpl service = MemberServiceImpl.getInstanceImpl();
		
		while (true) {
			
			switch (JOptionPane.showInputDialog(""
					+ "=== 회원 전용화면 ===\n"
					+ "1. 회원가입 2.로그인 3. 내정보보기 4.내정보수정(비밀번호) 5.탈퇴 0.종료\n"
					+ "=== 관리자 화면 ===\n"
					+ "11. 회원목록 12. 검색(ID) 13.검색(이름) 14.회원수(성별) 15.회원수")) {
			case "1":	
				MemberBean stu = new MemberBean();
				String input = JOptionPane.showInputDialog("id,pw,name,ssn");
				String[] inputArr = input.split(",");
				stu.setId(inputArr[0]);
				stu.setPw(inputArr[1]);
				stu.setName(inputArr[2]);
				stu.setSsn(inputArr[3]);
				stu.setRegDate();
				JOptionPane.showMessageDialog(null, service.regist(stu));
				break;
			case "2":	
				break;
			case "4":
				MemberBean stu2 = new MemberBean();
				String update = JOptionPane.showInputDialog("변경하실 아이디와 비밀번호를 입력하세요");
				String[] updateArr = update.split(",");
				stu2.setId(updateArr[0]);
				stu2.setPw(updateArr[1]);
				JOptionPane.showMessageDialog(null, service.update(stu2));
				break;
			case "5":
				String result3 = service.delete(JOptionPane.showInputDialog("삭제하실 ID를 입력하세요"));
				JOptionPane.showMessageDialog(null, service.delete(result3));
				break; 
			case "11": 
				JOptionPane.showMessageDialog(null, service.list());
				break;
			case "12": 
				String findID = JOptionPane.showInputDialog("검색하고자 하는 ID를 입력해주세요");
				JOptionPane.showMessageDialog(null, service.findById(findID));
				break;
			case "13":
				String findName = JOptionPane.showInputDialog("검색하고자 하는 이름을 입력해주세요");
				JOptionPane.showMessageDialog(null, service.findByName(findName));
			case "14": break;
			case "15": 
				int count = service.count();
				JOptionPane.showMessageDialog(null, count);
				break;
			case"0":
				return;
			}
		}
	}
}
