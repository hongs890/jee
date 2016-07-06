package bank2;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @date  : 2016. 6. 27.
 * @author: 배근홍
 * @file  : BankServiceImpl.java
 * @story  :
 */
public class BankServiceImpl implements BankService {
	
//=======================================================================
	
	private List<AccountBean> list;
	

	public BankServiceImpl() {
		this.list = new Vector<AccountBean>();
	}
	
	@Override
	public void openAccount(AccountBean bean) {
		// 11.개설 
		list.add(bean);
	}
	
	@Override
	public ArrayList<AccountBean> findAccount() {
		// 12.계좌조회
		return (ArrayList<AccountBean>) list;
		
	}
	@Override
	public AccountBean findByAccountNo(String account) {
		// 13.계좌번호로 조회
		AccountBean resultAccount = new AccountBean();
		int i = 0;
		for (i = 0; i < list.size(); i++) {
			if (String.valueOf(list.get(i).getAccountNo()).equals(account)) {
				resultAccount = list.get(i); 
			}
		}
		return resultAccount;
	}
	@Override
	public List<AccountBean> findByName(String name) {
		// 14.이름으로 조회
		List<AccountBean> resultName = new ArrayList<AccountBean>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getName().equals(name)) {
				resultName.add(list.get(i));
			}
		}
		return resultName;
	}

	@Override
	public int count() {
		// 15.통장의 갯수
		return list.size();
	}

	@Override
	public String updateAccount(AccountBean acc) {
		// 17.수정 (비밀번호만)
		String result ="";
		AccountBean temp = this.findByAccountNo(String.valueOf(acc.getAccountNo()));
			if (temp.getId() == null) {
				result = "계좌번호가 없습니다.";
			}else {
				temp.setPw(acc.getPw());
				result = "비밀번호가 변경되었습니다.";
			}
		return result;
	}

	@Override
	public String deleteAccount(String delete) {
		// 18. 삭제
		String result ="";
		AccountBean deleteTemp = this.findByAccountNo(delete);
		if (deleteTemp.getId() == null) {
			result ="계좌번호가 없습니다.";
		} else{
			list.remove(deleteTemp);
			result ="계좌가 정상적으로 삭제되었습니다";
		}
		return result;
	}



}
