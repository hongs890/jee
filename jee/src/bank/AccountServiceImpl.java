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
	public String deposit(String account, String inputMoney) {
		return String.valueOf(dao.deposit(account, inputMoney));
	}

	@Override
	public String withdraw(String account, String withdrawMoney) {

		return null;
	}

	@Override
	public String updateAccount(AccountBean acc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteAccount(String delete) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<AccountBean> findAccount() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountBean findByAccountNo(String account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<AccountBean> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
