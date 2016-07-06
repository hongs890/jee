package bank;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import global.Constants;
import global.DatabaseFactory;
import global.Vendor;

/**
 * @date  : 2016. 7. 6.
 * @author: 배근홍
 * @file  : AccountDAO.java
 * @story  :
 */
public class AccountDAO {
	Connection con;
	Statement stmt;
	ResultSet set;
	PreparedStatement pstmt;
	
	
	private static AccountDAO dao = new AccountDAO();
	public static AccountDAO getDao() {
		return dao;
	}
	private AccountDAO() {
		con = DatabaseFactory.createDatabase(Vendor.ORACLE, 
			Constants.USER_ID, 
			Constants.USER_PW).getConnection();
	}

	public int openAccount(AccountBean bean){
		int result = 0;
		String sql = "insert into account(id, pw, account_no, money) values(?, ?, ?, ?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bean.getId());
			pstmt.setString(2, bean.getPw());
			pstmt.setInt(3, bean.getAccountNo());
			pstmt.setInt(4, bean.getMoney());
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}
	public int deposit(String account, String inputMoney){
		int result = 0;
		String sql = "update account set money = ? where account_no = ?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(inputMoney));
			pstmt.setInt(2, Integer.parseInt(account));
			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int withDraw (String account, String withdrawMoney){
		int result = 0;
		String sql = "";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}
