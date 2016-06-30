/**
 * 
 */
package bank;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : AccountService.java
 * @story :
 */
public interface AccountService {
	//1.개설 2.입금 3.조회 4.출금 5.통장내역보기
	
	// 1개설
	public abstract void openAccount(int accountNo, String name, String id, String pw);
	// 2입금
	public void deposit(int inputMoney);
	// 3조회
	public void findAccount();
	// 4출금
	public String withdraw(int output);
	// 5통장내역보기
	public String showAccount();
	// 6해지
	public String deleteAccount();
}

