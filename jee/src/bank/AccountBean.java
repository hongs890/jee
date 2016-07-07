/**
 * 
 */
package bank;

import java.util.Random;

import global.Constants;

/**
 * @date : 2016. 6. 16.
 * @author: 배근홍
 * @file : Account.java
 * @story :
 */
public class AccountBean {
	private int accountNo, money; 
	private String id;
	
	public int getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
