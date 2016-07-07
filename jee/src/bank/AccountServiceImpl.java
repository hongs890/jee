/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : AccountServiceImpl.java
 * @story : 계좌 인터페이스
 */
public class AccountServiceImpl implements AccountService {
	AccountDAO dao = AccountDAO.getDao();
	private static AccountServiceImpl instence = new AccountServiceImpl();
	public static AccountServiceImpl getInstence() {
		return instence;
	}
	private AccountServiceImpl() {}

	@Override
	public String openAccount(AccountBean acc) {
		String result = "";
		acc.setAccountNo((int) (Math.random()*999999)+100000);
		if (dao.openAccount(acc) == 1) {
			result = "계좌 개설에 성공하였습니다";
		}else {
			result = "계좌 개설에 실패하였습니다";
		}
		return result;
	}

	@Override
	public String deposit(String accountNo, String money) {
		return String.valueOf(dao.deposit(accountNo, money));
	}

	@Override
	public String withdraw(String account, String withdrawMoney) {
		String result = "";
		if (Integer.parseInt(withdrawMoney) > dao.findByAcc(Integer.parseInt(account)).getMoney()) {
			result = "잔고가 부족합니다";
		}else {
			result = String.valueOf(dao.withDraw(account, withdrawMoney));
		}
		return result;
	}

	@Override
	public String updateAccount(AccountBean acc) {
		return String.valueOf(dao.updateAccount(acc));
	}

	@Override
	public String deleteAccount(String delete) {
		// TODO Auto-generated method stub
		return String.valueOf(dao.deleteAccount(delete));
	}

	@Override
	public List<AccountMemberBean> findAccount() {
		return dao.findAccount();
	}

	@Override
	public AccountMemberBean findByAccountNo(int account) {
		return dao.findByAcc(account);
	}

	@Override
	public List<AccountMemberBean> findByName(String name) {
		return dao.findByName(name);
	}

	@Override
	public int count() {
		return dao.count();
	}
	
}
