package member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import global.Constants;

/**
 *  * @date  : 2016. 7. 1.  * @author: 배근홍  * @file  : MemberDAO.java  * @story 
 * :  
 */

public class MemberDAO {
	Connection con = null;
	Statement stmt = null;
	ResultSet rs = null; // executeQuery() 에서만 리턴받는 객체
	PreparedStatement pstmt = null;
	private static MemberDAO instance = new MemberDAO();

	public static MemberDAO getInstance() {
		return instance;
	}

	private MemberDAO() {
	}

	public int insert(MemberBean mem) {
		String sql = "insert into member(id,pw,name,reg_date,ssn)" + "values('" + mem.getId() + "','" + mem.getPw()
				+ "','" + mem.getName() + "'," + "'" + mem.getRegDate() + "','" + mem.getSsn() + "')";
		return this.exeUpdate(sql);
	}

	public int update(MemberBean mem) {
		String sql = "update member set pw = '" + mem.getPw() + "'" + "where id = '" + mem.getId() + "'";
		return this.exeUpdate(sql);
	}

	public int delete(String id) {
		String sql = "delete from member where id = '" + id + "'";
		return this.exeUpdate(sql);
	}

	public int exeUpdate(String sql) {
		int updateResult = 0;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			updateResult = stmt.executeUpdate(sql);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (updateResult == 0) {
			System.out.println("성공");
		} else {
			System.out.println("실패");
		}
		return updateResult;
	}

	// list
	public List<MemberBean> list() {
		String sql = "select * from member";
		List<MemberBean> list = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberBean t = new MemberBean(rs.getString("ID"), rs.getString("NAME"), rs.getString("PW"),
						rs.getString("SSN"));
				t.setRegDate(rs.getString("REG_DATE"));
				list.add(t);
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	// findByPK
	public MemberBean findById(String pk) {
		String sql = "select * from member where id = '" + pk + "'";
		MemberBean temp = null;
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				temp = new MemberBean(rs.getString("ID"), rs.getString("NAME"), rs.getString("PW"),
						rs.getString("SSN"));
				temp.setRegDate(rs.getString("REG_DATE"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return temp;
	}

	// findByNotPK
	public List<MemberBean> findByName(String name) {
		String sql = "select * from member where name = '"+name+"'";
		List<MemberBean> list2 = new ArrayList<MemberBean>();
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			while (rs.next()) {
				MemberBean mem = new MemberBean(rs.getString("ID"), rs.getString("NAME"), rs.getString("PW"),
						rs.getString("SSN"));
				mem.setRegDate(rs.getString("REG_DATE"));
				list2.add(mem);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list2;
	}

	// count
	public int count() {
		int count = 0;
		String sql = "select count(*) as count from member";
		try {
			Class.forName(Constants.ORACLE_DRIVER);
			con = DriverManager.getConnection(Constants.ORACLE_URL, Constants.ORACLE_ID, Constants.ORACLE_PW);
			stmt = con.createStatement();
			rs = stmt.executeQuery(sql);
			if (rs.next()) {
				count = rs.getInt("count");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return count;
	}
}
