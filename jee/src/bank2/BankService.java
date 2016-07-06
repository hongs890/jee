package bank2;

import java.util.ArrayList;
import java.util.List;

/**
 *  * @date  : 2016. 6. 27.  * @author: 배근홍  * @file  : BankService.java
 *  * @story  :  
 */
public interface BankService {

	// CREATE : 11개설
	public abstract void openAccount(AccountBean bean);

	// READ : 12조회 (전체)
	public ArrayList<AccountBean> findAccount();

	// READ : 13조회 (계좌번호)
	public AccountBean findByAccountNo(String account);
	

	// READ : 14조회 (이름)
	public List<AccountBean> findByName(String name);

	// READ : 15조회 (전체통장수)
	public int count();

	// UPDATE : 16수정.. 사용자의 요청에 의해 비밀번호만 변경가능
	public String updateAccount(AccountBean acc);

	// DELETE : 17해지
	public String deleteAccount(String delete);
}
