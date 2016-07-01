package grade;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


import global.Constants;

/**
 * @date  : 2016. 7. 1.
 * @author: 배근홍
 * @file  : GradeDAO.java
 * @story  :
 */

/*
 * 	public GradeBean(String name, int kor, int eng, int math) {
	this.name = name;
	this.kor = kor;
	this.eng = eng;
	this.math = math;
 * */
public class GradeDAO {
	public static void main(String[] args) {
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		int updateResult = 0;
		String sqlCreate = "create table grade("
				+ "name varchar2(20),"
				+ "kor int,"
				+ "eng int,"
				+ "math int)";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(
					Constants.ORACLE_URL,
					Constants.ORACLE_ID,
					Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sqlCreate);
			String sqlDrop = "drop table grade";
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (updateResult ==0) {
			System.out.println("성공");
		}else{
			System.out.println("실패");
		}
	}

}
