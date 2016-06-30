package member;

/**
 * @date  : 2016. 6. 30.
 * @author: 배근홍
 * @file  : MemberMain.java
 * @story  :
 */
public class MemberMain {
	public static void main(String[] args) {
		MemberBean m = new MemberBean(); // 생성자를 이용한 인스턴스 생성
		MemberBean m2 = new MemberBean(); // 생성자를 이용한 인스턴스 생성
		try {
			MemberBean m4 = (MemberBean) Class.forName("member.MemberBean").newInstance();
			m4.setId("hong");
			m4.setName("홍길동");
			m4.setPw("1");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(m.toString());
	}
}
