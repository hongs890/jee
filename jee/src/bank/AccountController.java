

/**
 * 
 */
package bank;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.print.attribute.standard.JobMessageFromOperator;
import javax.swing.JOptionPane;

import global.Constants;

/**
 * @date  : 2016. 6. 15.
 * @author: 배근홍
 * 
 * @file  : BankContorller.java
 * @story :
 */


public class AccountController {
	public static void main(String[] args) {
		AccountServiceImpl service = AccountServiceImpl.getInstence();
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설\n2.입금\n3.출금\n4.수정 \n5.해지\n"
					+ "6.조회(전체)\n7.조회(계좌번호)\n8.조회(이름)\n9.조회(전체통장수)\n10.로그인\n0.종료")) {
			case "1":
				AccountBean bean = new AccountBean();
				String regist = JOptionPane.showInputDialog("ID를 입력하면 계좌가 개설됩니다.");
				bean.setId(regist);
				JOptionPane.showMessageDialog(null, service.openAccount(bean));
				break;
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금하실 계좌번호와 금액을 입력하세요");
				String[] inputMoney2 = inputMoney.split(",");
				JOptionPane.showMessageDialog(null, service.deposit(inputMoney2[0], inputMoney2[1]));
				break;
			case "3":
				String drawMoney = JOptionPane.showInputDialog("출금하실 계좌번호와 금액을 입력하세요");
				String[] drawMoney2 = drawMoney.split(",");
				JOptionPane.showMessageDialog(null, service.withdraw(drawMoney2[0], drawMoney2[1]));
				break;
			case "4":
				AccountMemberBean bean3 = new AccountMemberBean();
				String revise = JOptionPane.showInputDialog("수정할 ID와 비밀번호를 입력해주세요");
				String[] revise2 = revise.split(",");
				bean3.setId(revise2[0]);
				bean3.setPw(revise2[1]);
				JOptionPane.showMessageDialog(null, service.updateAccount(bean3));
				break;
			case "5":
				String delete = JOptionPane.showInputDialog("삭제하실 계좌번호를 입력해주세요");
				JOptionPane.showMessageDialog(null, service.deleteAccount(delete));
				break;
			case "6":
				/*JOptionPane.showMessageDialog(null, service.findAccount());*/
				BankUI ui = new BankUI();
				break;
			case "7":
				String findByAccount = JOptionPane.showInputDialog("조회하실 계좌번호를 입력해주세요");
				JOptionPane.showMessageDialog(null, service.findByAccountNo(Integer.parseInt(findByAccount)));
				break;
			case "8":
				String findByName = JOptionPane.showInputDialog("조회하실 이름을 입력해주세요");
				JOptionPane.showMessageDialog(null, service.findBy(findByName));
				break;
			case "9":
				JOptionPane.showMessageDialog(null, "전체 통장 수는" + service.count()+"개 입니다.");
				break;
			case "10":
				
				break;
			case "0":return;
			}
		}
	}
}
