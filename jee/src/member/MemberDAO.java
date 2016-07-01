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

/*
 * 	id varchar2(20) primary key,
	pw varchar2(20),
	name varchar2(20),
	regDate int,
	gender varchar2(20),
	ssn int	
 * */
public class MemberDAO {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sqlCreate = "create table member("
				+ "id varchar2(20) primary key,"
				+ "pw varchar2(20),"
				+ "name varchar2(20),"
				+ "reg_date varchar2(20),"
				+ "ssn varchar2(10)"
				+ ")";
		String sqlDrop = "drop table member";
		String sqlInsert ="";
		int updateResult = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.ORACLE_ID,
					Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sqlCreate);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("DB다녀온 결과 : " + updateResult);
	}
}
