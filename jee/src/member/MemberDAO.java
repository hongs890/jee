package member;

import java.lang.reflect.Executable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import global.Constants;

/**
 * @date  : 2016. 7. 1.
 * @author: 배근홍
 * @file  : MemberDAO.java
 * @story  :
 */


public class MemberDAO {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null;
	private static MemberDAO instance = new MemberDAO();
	
	public static MemberDAO getInstance() {
		return instance;
	}
	private MemberDAO() {
	}
	public int exeUpdate(String sql) {
		int updateResult = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.ORACLE_ID,
					Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sql);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (updateResult == 0) {
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
		return updateResult;
	}
	
	public void exeQuery(String sql){
		
	}
}
