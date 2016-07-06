/**
 * 
 */
package bank2;

import java.util.List;
import java.util.Random;

import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date  : 2016. 6. 15.
 * @author: 배근홍
 * @file  : BankContorller.java
 * @story :
 */
public class BankController {
	public static void main(String[] args) {
		AccountService accountService = new AccountServiceImpl();
		BankService bankService = new BankServiceImpl();
		AccountBean tempAcc = new AccountBean();
		String spec ="";
		String[] spec2 = new String[3];
		int y=0;
		while (true) {
			switch (JOptionPane.showInputDialog(null, "=====사용자모드=====\n1.개설 2.입금 3.조회 4.출금 5.통장내역보기 6.해지 \n"
					+ "=====관리자모드===== \n 11. 개설\n 12.조회(전체)\n 13.조회(계좌번호)\n 14.조회(이름)\n"
					+ " 15.조회(전체통장수)\n 16.수정\n 17.해지\n 0.종료")) {
			case "1":
				spec = JOptionPane.showInputDialog("이름, ID, PW");
				spec2 = spec.split(",");
				accountService.openAccount(y, spec2[0],spec2[1],spec2[2]);
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금받은 금액이 얼마입니까?");
				accountService.deposit(Integer.parseInt(inputMoney));	
				break;
			case "3":
				/*JOptionPane.showMessageDialog(null, "현재잔액 : "+ service.findAccount());*/
				break;
			case "4":
				String output = JOptionPane.showInputDialog("출금하실 금액을 입력해주세요");
				JOptionPane.showMessageDialog(null,accountService.withdraw(Integer.parseInt(output)));
				break;
			case "5":
				JOptionPane.showMessageDialog(null,accountService.showAccount());
				break;
			case "6":
				JOptionPane.showMessageDialog(null,accountService.deleteAccount());
				break;
				
			case "11":
				AccountBean bean = new AccountBean();
				spec = JOptionPane.showInputDialog("이름, ID, PW");
				spec2 = spec.split(",");
				bean.setAccountNo();
				bean.setName(spec2[0]);
				bean.setId(spec2[1]);
				bean.setPw(spec2[2]);
				bankService.openAccount(bean);
				break;
			case "12":
				JOptionPane.showMessageDialog(null, bankService.findAccount());
				break;
			case "13":
				tempAcc = bankService.findByAccountNo(JOptionPane.showInputDialog("조회하고자 하는 계좌번호를 입력하세요"));
				JOptionPane.showMessageDialog(null, (tempAcc.getId()==null)?"조회 계좌 없음":tempAcc.toString());
				break;
			case "14":
				List<AccountBean> resultName = bankService.findByName(JOptionPane.showInputDialog("조회하고자 하는 이름을 입력하세요"));
				JOptionPane.showMessageDialog(null, (resultName.isEmpty()?"검색하는 이름이 없습니다.":resultName.toString()));
				break;
			case "15":
				JOptionPane.showMessageDialog(null, "개설된 통장의 갯수 : " + bankService.count());
				break;
			case "16":
				String change = JOptionPane.showInputDialog("수정하려는 계좌번호, 비밀번호");
				String[] changeArr = change.split(",");
				tempAcc.setAccountNo(Integer.parseInt(changeArr[0]));
				tempAcc.setPw(changeArr[1]);
				JOptionPane.showMessageDialog(null, bankService.updateAccount(tempAcc));
				break;
			case "17":
				String delete = JOptionPane.showInputDialog("삭제하려는 계좌번호");
				JOptionPane.showMessageDialog(null, bankService.deleteAccount(delete));
				break;
			case "0":	
				y = JOptionPane.showConfirmDialog(null, "정말 종료하시겠습니까?");
				if (y==0) {
					return;
				}
				break;
			}
		}
	}

	/**
	 * @return
	 */
	private static int accountsetAccountNo() {
		// TODO Auto-generated method stub
		return 0;
	}
}
