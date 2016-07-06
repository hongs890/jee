/**
 * 
 */
package bank2;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : AccountServiceImpl.java
 * @story : 계좌 인터페이스
 */
public class AccountServiceImpl implements AccountService {
	//1.개설 2.입금 3.조회 4.출금 5.통장내역보기
		AccountBean account;
	
	@Override
	public void openAccount(int accountNo, String name, String id, String pw) {
		// 1 개설
		account = new AccountBean(accountNo, name,id,pw);
	}

	@Override
	public void deposit(int inputMoney) {
		// 2입금
		int money = account.getMoney();
		money += inputMoney;
		account.setMoney(money);
		
	}

	@Override
	public void findAccount() {
		// 3조회
	}

	@Override
	public String withdraw(int output) {
		//4출금
		String result = "잔액부족";
		int money = account.getMoney();
		if (output <= money) {
			money -= output;
			account.setMoney(money);
			result = String.valueOf(account.getMoney());
		}
		return result;
	}

	@Override
	public String showAccount() {
		// 5통장내역보기
		return account.toString();
	}

	@Override
	public String deleteAccount() {
		// 6해지
		account = null;
		return "해지되었습니다";
	}
}
