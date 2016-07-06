/**
 * 
 */
package bank2;

import java.util.Random;

import global.Constants;

/**
 * @date : 2016. 6. 16.
 * @author: 배근홍
 * @file : Account.java
 * @story :
 */
public class AccountBean {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다.
	private String name;
	private int money;
	private String pw;
	private String id;

	// --------------------------------------
	public AccountBean() {
		// default constructer 기본 생성자
		// 생성자 오버로딩
	}

	public AccountBean(int accountNo, String name, String id, String pw) {
		this.accountNo = accountNo;
		this.name = name;
		this.id = id;
		this.pw = pw;
	}

	public void setAccountNo() {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	

	public void setName(String name) {
		this.name = name;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	// -----------------------------------------
	public int getAccountNo() {
		return this.accountNo;
	}

	public String getName() {
		return this.name;
	}

	public int getMoney() {
		return this.money;
	}

	public String getPw() {
		return this.pw;
	}

	public String getId() {
		return this.id;
	}

	// ---------------------------------------
	@Override
	public String toString() { // 메소드 오버라이딩
		return Constants.BANK_NAME + "Account [계좌번호=" + accountNo + ", 이름=" + name + ", 잔액=" + money + ", 비번=" + pw
				+ ", 아이디=" + id + "]\n";
	}
}
