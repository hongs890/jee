/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;

/**
 * @date  : 2016. 6. 20.
 * @author: 배근홍
 * @file  : AccountService.java
 * @story :
 */
public interface AccountService {
	//1.개설 2.입금 3.조회 4.출금 5.통장내역보기
	
	// 1개설
	public String openAccount(AccountBean acc);
	// 2입금
	public String deposit(String accountNo, String money);
	// 3출금
	public String withdraw(String account, String withdrawMoney);
	// 4수정.. 사용자의 요청에 의해 비밀번호만 변경가능
	public String updateAccount(AccountBean acc);
	// 5해지
	public String deleteAccount(String delete);
	// 6조회 (전체)
	public List<AccountMemberBean> findAccount(); // 뷰로 받아야 한다. 
	// 7조회 (계좌번호)
	public AccountMemberBean findByAccountNo(int account);
	// 8조회 (이름)
	public List<AccountMemberBean> findByName(String name);
	// 9조회 (전체통장수)
	public int count();
	
}

