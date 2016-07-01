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
			
			switch (JOptionPane.showInputDialog(null, "1. 등록 2.보기 3.수정 4.삭제 0.종료")) {
			case "1":	
				MemberBean stu = new MemberBean();
				String input = JOptionPane.showInputDialog("id,pw,name,ssn");
				String[] inputArr = input.split(",");
				stu.setId(inputArr[0]);
				stu.setPw(inputArr[1]);
				stu.setName(inputArr[2]);
				stu.setSsn(inputArr[3]);
				stu.setRegDate();
				String result = service.regist(stu);
				JOptionPane.showMessageDialog(null, result);
				break;
			case "2":	
				JOptionPane.showMessageDialog(null,service.show());
				break;
			case "3":
				String pw = JOptionPane.showInputDialog("변경하실 비밀번호를 입력하세요");
				service.update(pw);
				break;
			case "4":
				JOptionPane.showMessageDialog(null, service.delete());
				break; 
			case"0":
				return;
			}
		}
	}
}
