package test;

import bank.AccountBean;

/**
 * @date  : 2016. 7. 1.
 * @author: 배근홍
 * @file  : Reflection.java
 * @story  :
 */
public class ReflectionTest2 {
	public static void main(String[] args) {
		try {
			AccountBean ab = (AccountBean) Class.forName("bank.AccountBean").newInstance();
			ab.setId("hong");
			ab.setMoney(500);
			ab.setName("홍길동");
			ab.setPw("1");
			ab.setAccountNo(123456);
			System.out.println(ab.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
